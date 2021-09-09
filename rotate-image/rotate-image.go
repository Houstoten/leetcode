func rotate(matrix [][]int)  {
    
    lenReduced := len(matrix) - 1
    
    temp := 0
        
    for i := 0; i < (lenReduced + 1) / 2; i++ {
        for j := i; j < lenReduced - i; j++ {
            temp = matrix[i][j]
            
            matrix[i][j] = matrix[lenReduced - j][i]
            
             matrix[lenReduced - j][i] = matrix[lenReduced - i][lenReduced - j]
        
            matrix[lenReduced - i][lenReduced - j] = matrix[j][lenReduced - i]
            
            matrix[j][lenReduced - i] = temp
        }
    }
        
    
}