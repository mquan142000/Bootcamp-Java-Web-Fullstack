import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleClassifierTest {
    @Test
    public void testEquilateralTriangle(){
        assertEquals("Tam giác đều", TriangleClassifier.classifyTriangle(2, 2, 2));
    }

    @Test
    public void testIsoscelesTriangle(){
        assertEquals("Tam giác cân", TriangleClassifier.classifyTriangle(2, 2, 3));
    }

    @Test
    public void testScaleneTriangle(){
        assertEquals("Tam giác thường", TriangleClassifier.classifyTriangle(2, 3, 4));
    }

    @Test
    public void testNotATriangle(){
        assertEquals("Không phải là tam giác", TriangleClassifier.classifyTriangle(2, 3, 5));
    }

    @Test
    public void testNotATriangle2(){
        assertEquals("Không phải là tam giác", TriangleClassifier.classifyTriangle(0, 0, 0));
    }

    @Test
    public void testNotATriangle3(){
        assertEquals("Không phải là tam giác", TriangleClassifier.classifyTriangle(-1, 0, 0));
    }
}
