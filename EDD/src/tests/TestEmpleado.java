package tests;

import static org.junit.Assert.*;


import org.junit.Test;

import syspagos.Empleado;
import excepciones.*;

public class TestEmpleado 
{
	@Test 
	public void establecerNumeroDeEmpleadoCorrecto() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerNumeroEmpleado("332");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(322,e.getNumeroEmpleado());
        
        try 
        {
            e.establecerNumeroEmpleado("32");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertNotEquals(32,e.getNumeroEmpleado());
        
        try 
        {
            e.establecerNumeroEmpleado("3242");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertNotEquals(3242,e.getNumeroEmpleado());
        try 
        {
            e.establecerNumeroEmpleado("-2243");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertNotEquals(-2243,e.getNumeroEmpleado());
        
        try 
        {
            e.establecerNumeroEmpleado(null);
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertNotEquals(null,e.getNumeroEmpleado());
        
        try 
        {
            e.establecerNumeroEmpleado("000");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertNotEquals(000,e.getNumeroEmpleado());
	}
	
	@Test
	public void establecerNombreEmpleadoCorrecto()
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceNombreEmpleado("Juan");
        } catch (NombreEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals("Juan",e.getNombreEmpleado());
        
        try 
        {
            e.estableceNombreEmpleado("JuanMarquesDelAlamo");
        } catch (NombreEmpleadoException ex) 
        {
        	fail();
        }
        assertNotEquals("JuanMarquesDelAlamo",e.getNombreEmpleado());
        
        try 
        {
            e.estableceNombreEmpleado("@Juan");
        } catch (NombreEmpleadoException ex) 
        {
        	fail();
        }
        assertNotEquals("@Juan",e.getNombreEmpleado());
        
        try 
        {
            e.estableceNombreEmpleado(null);
        } catch (NombreEmpleadoException ex) 
        {
        	fail();
        }
        assertNotEquals(null,e.getNombreEmpleado());
	}
	
	@Test
	public void estableceMesesTrabajoCorrecto()
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceMesesTrabajo("032");
        } catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertEquals(032,e.getMesesTrabajo());
        
        try 
        {
            e.estableceMesesTrabajo("-2");
        } catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertNotEquals(-2,e.getMesesTrabajo());
        
        try 
        {
            e.estableceMesesTrabajo("0324");
        } catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertNotEquals(0324,e.getMesesTrabajo());
        
        try 
        {
            e.estableceMesesTrabajo(null);
        } catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertNotEquals(null,e.getMesesTrabajo());
	}
	
	@Test
	public void establecerSerDirectivoCorrecto()
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerSerDirectivo("+");
        } catch (CargoException ex) 
        {
        	fail();
        }
        assertEquals(true,e.getDirectivo());
        
        try 
        {
            e.establecerSerDirectivo("/");
        } catch (CargoException ex) 
        {
        	fail();
        }
        assertNotEquals(true,e.getDirectivo());
        
        try 
        {
            e.establecerSerDirectivo(null);
        } catch (CargoException ex) 
        {
        	fail();
        }
        assertNotEquals(true,e.getDirectivo());
	}
	
	@Test
	public void calcularPrimaCorrecta()
	{
		Empleado e = new Empleado();
        try 
        {
            e.calcularPrima("322","Juan","032","+");
        } catch (Exception ex) 
        {
        	fail();
        }
        assertEquals("P1",e.getPrima());
        
        try 
        {
            e.calcularPrima("322","Juan","123","-");
        } catch (Exception ex) 
        {
        	fail();
        }
        assertEquals("P2",e.getPrima());
        
        try 
        {
            e.calcularPrima("322","Juan","002","+");
        } catch (Exception ex) 
        {
        	fail();
        }
        assertEquals("P3",e.getPrima());
        
        try 
        {
            e.calcularPrima("322","Juan","032","+");
        } catch (Exception ex) 
        {
        	fail();
        }
        assertEquals("P4",e.getPrima());
        
	}

}
