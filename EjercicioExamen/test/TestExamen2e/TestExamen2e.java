/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package TestExamen2e;

import main1.Examen2e;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fran
 */
public class TestExamen2e {
    
    
Examen2e persona1 = new Examen2e("Lengua", "22-02-2022", "T3", "Fran Rubio", 6, 7.6, 0.4, 0.6, 5);
    
   public TestExamen2e(){
       
   }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

  @Test
  public void notaExamenTest(){
      double notaExamen = 0 ;
        double nota1Ponderada = 0;
        double nota2Ponderada = 0;
        
        nota1Ponderada = this.persona1.getNota1()*this.persona1.getPonderacionNota1();
        nota2Ponderada = this.persona1.getNota2()*this.persona1.getPonderacionNota2();
        
        
        notaExamen=nota1Ponderada+nota2Ponderada;
        
        double notaExamen1=persona1.notaExamen();
        
        assertEquals(notaExamen, notaExamen1,0.1);
  }
  
  @Test
  public void superadoTest(){
       //    Double notaExamen = persona1.notaExamen();
           boolean superado=persona1.superado();
           
           
        
        assertEquals(true, superado);
  }
  
  
  
}
