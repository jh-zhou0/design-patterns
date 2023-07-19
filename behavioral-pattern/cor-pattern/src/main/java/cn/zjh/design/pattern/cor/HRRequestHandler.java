package cn.zjh.design.pattern.cor;

/**
 * @author zjh - kayson
 */
public class HRRequestHandler implements RequestHandler {
    @Override
    public void handler(Request request) {
        if (request instanceof DimissionRequest) {
            System.out.println("要离职, 人事审批!");
        }
        System.out.println("请求完毕");
    }
}
