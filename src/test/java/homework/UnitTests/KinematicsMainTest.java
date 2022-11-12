package homework.UnitTests;

import junit.framework.TestCase;
import org.junit.Test;

public class KinematicsMainTest extends TestCase {
    @Test

    void greitejantObjektuiJisNestoviVietoje(){
      KinematicsService kinematicsService = new KinematicsService();
   float  pagreitisTeigiamas = kinematicsService.apskaiciuotiPagreiti(10,0, 5);
   assertEquals(2, 2);

    }

}