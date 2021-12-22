package model;
// Generated Nov 11, 2021 2:40:31 PM by Hibernate Tools 4.3.1



/**
 * CategoryMoive generated by hbm2java
 */
public class CategoryMoive  implements java.io.Serializable {


     private Integer idCategoryMoive;
     private Category category;
     private Movie movie;

    public CategoryMoive() {
    }

    public CategoryMoive(Category category, Movie movie) {
       this.category = category;
       this.movie = movie;
    }
   
    public Integer getIdCategoryMoive() {
        return this.idCategoryMoive;
    }
    
    public void setIdCategoryMoive(Integer idCategoryMoive) {
        this.idCategoryMoive = idCategoryMoive;
    }
    public Category getCategory() {
        return this.category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }
    public Movie getMovie() {
        return this.movie;
    }
    
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return category.getName();
    }

}

