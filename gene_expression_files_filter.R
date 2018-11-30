file_list=read.table("list_of_gene_exp_files.txt")
base_matrix=read.table("trimmed_ppi.txt", sep="\t", header=TRUE)

for(i in 1:length(file_list[,1])){
  nfname2=as.character(file_list[i,1])
  geFile=read.table(nfname2, sep="\t", header=TRUE)
  part_A=dplyr::inner_join(geFile, base_matrix, by=c("Gene"="GeneA"))
  part_B=dplyr::inner_join(geFile, base_matrix, by=c("Gene"="GeneB"))
  part_A$GeneB=NULL
  part_B$GeneA=NULL
  n_matrix=dplyr::union(part_A, part_B)
  write.table(n_matrix, file=paste0(nfname2,"_real_final_matrix.txt"), sep="\t", quote=F,col.names=T, row.names=F)
}
