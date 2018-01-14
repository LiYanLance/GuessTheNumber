import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CompareNumberTest {

    @Test
    public void shouldReturn4A0BWhenInputIs1234and1234(){
        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare("1234","1234");
        assertThat(result,is("4A0B"));
    }

    @Test
    public void shouldReturn3A0BWhenInputIs1234and1235(){
        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare("1234","1235");
        assertThat(result,is("3A0B"));
    }

    @Test
    public void shouldReturn2A2BWhenInputIs1234and1243(){
        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare("1234","1243");
        assertThat(result,is("2A2B"));
    }

    @Test
    public void shouldReturn2A1BWhenInputIs1234and1245(){
        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare("1234","1245");
        assertThat(result,is("2A1B"));
    }

    @Test
    public void shouldReturn2A0BWhenInputIs1234and1256(){
        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare("1234","1256");
        assertThat(result,is("2A0B"));
    }

    @Test
    public void shouldReturn1A3BWhenInputIs1234and1423(){
        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare("1234","1423");
        assertThat(result,is("1A3B"));
    }

    @Test
    public void shouldReturn1A2BWhenInputIs1234and1425(){
        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare("1234","1425");
        assertThat(result,is("1A2B"));
    }

    @Test
    public void shouldReturn1A1BWhenInputIs1234and1456(){
        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare("1234","1456");
        assertThat(result,is("1A1B"));
    }

    @Test
    public void shouldReturn1A0BWhenInputIs1234and1567(){
        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare("1234","1567");
        assertThat(result,is("1A0B"));
    }

    @Test
    public void shouldReturn0A0BWhenInputIs1234and5678(){
        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare("1234","5678");
        assertThat(result,is("0A0B"));
    }
}
