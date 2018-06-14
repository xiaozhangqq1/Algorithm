package Interview_Notebook_GitHub;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by zhangxuelong on 2018/6/14
 */
@RunWith(Arquillian.class)
public class ThreeSumSlowTest {
    @Test
    public void count() throws Exception {
    }

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(ThreeSumSlow.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
