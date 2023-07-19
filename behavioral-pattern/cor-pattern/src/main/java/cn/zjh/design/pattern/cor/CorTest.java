package cn.zjh.design.pattern.cor;

import org.junit.Test;

/**
 * @author zjh - kayson
 */
public class CorTest {
    
    @Test
    public void test() {
        RequestHandler hr = new HRRequestHandler();
        RequestHandler pm = new PMRequestHandler(hr);
        RequestHandler tl = new TLRequestHandler(pm);

        // team leader处理离职请求
        Request request = new LeaveRequest();
        tl.handler(request);

        System.out.println("===========");
        // team leader处理加薪请求
        request = new AddMoneyRequest();
        tl.handler(request);

        System.out.println("========");
        // 项目经理处理辞职请求
        request = new DimissionRequest();
        pm.handler(request);
    }
    
}
