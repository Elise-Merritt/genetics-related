df_matrix=read.table("gene_exp_file_example.txt", header=T, sep="\t")
gene_one=data.frame(df_matrix$Gene)
for(i in 2:dim(df_matrix)[2]){
  n_matrix=cbind(gene_one,df_matrix[,i])
  colnames(n_matrix)=(c("Gene","Exp"))
  nfname=colnames(df_matrix)[i]
  write.table(n_matrix,file=paste0(as.character(nfname), "_final_matrix.txt"), sep="\t", quote=F, col.names=T, row.names=F)
}
