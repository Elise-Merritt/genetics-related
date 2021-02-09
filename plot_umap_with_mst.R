plot_umap_result=function(dtable, varname){
  #need to remove duplicates and non-numeric columns first
  set.seed(20)
  umap <- umap(dtable)
  varcolumn=match(varname, names(dtable))
  df <- data.frame(x = umap$layout[,1], y = umap$layout[,2], 
                   varname = dtable[!duplicated(dtable), varcolumn])
  mst=ComputeMST(df)
  ggplot(df, aes(x, y, colour = varname)) + geom_point()+stat_MST(data=mst, aes(from=from, to=to), linetype=1)
}
#Code
library(umap)
library(ggplot2)
library(emstreeR)
dt=iris[!duplicated(iris),]
ndt=dt[,1:4]
plot_umap_result(ndt, "Sepal.Length")
#[1] AML                         Adrenal-neoplasm            Biliary-AdenoCa            
#[4] Breast-cancer               CNS-GBM                     Cervix-CA                  
#[7] ColoRect-AdenoCa            DLBC                        Eso-AdenoCa                
#[10] Eye-Melanoma                Head-SCC                    Kidney-ChRCC               
#[13] Kidney-Papillary            Kidney-RCC                  Liver-HCC                  
#[16] Lung-AdenoCa                Lung-SCC                    Lymph-BNHL                 
#[19] Mesothelium-Mesothelioma    Ovary-AdenoCa               Panc-AdenoCa               
#[22] Pheochromocytoma            Prost-AdenoCa               Sarcoma                    
#[25] Skin-Melanoma               Stomach-AdenoCa             Testis-Ca                  
#[28] Thy-AdenoCa                 Thymoma                     Transitional-cell-carcinoma
#[31] UCS                         Uterus-AdenoCa
uac_dt=dplyr::filter(dt, Cancer.Types=="Uterus-AdenoCa")
uac_ndt=uac_dt[,3:68]
uac_ndt=uac_ndt[!duplicated(uac_ndt),]
plot_umap_result(uac_ndt, "SBS1")