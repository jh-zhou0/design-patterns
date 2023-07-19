package cn.zjh.design.pattern.cor;

/**
 * @author zjh - kayson
 */
public class TLRequestHandler implements RequestHandler {

    private RequestHandler rh;
    public TLRequestHandler(RequestHandler rh) {
        this.rh = rh;
    }

    @Override
    public void handler(Request request) {
        if (request instanceof LeaveRequest) {
            System.out.println("要请假, 项目组长审批!");
        } else {
            rh.handler(request);
        }
    }
}
