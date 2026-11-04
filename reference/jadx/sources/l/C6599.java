package l;

import android.graphics.Bitmap;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: l.ۛᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11V2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6599 implements InterfaceC11615, InterfaceC17544, InterfaceC21100, InterfaceC17242, InterfaceC22615 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22084;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f22085;

    public /* synthetic */ C6599(int i, Object obj) {
        this.f22084 = i;
        this.f22085 = obj;
    }

    @Override // l.InterfaceC17242
    /* JADX INFO: renamed from: ۫ */
    public void mo4897() {
        ((ActivityC0885) this.f22085).m3614();
    }

    @Override // l.InterfaceC22615
    public Object construct() {
        Constructor constructor = (Constructor) this.f22085;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            int i = C1971.f6612;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.15.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + C1971.m6782(constructor) + "' with no args", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke constructor '" + C1971.m6782(constructor) + "' with no args", e3.getCause());
        }
    }

    @Override // l.InterfaceC17544
    /* JADX INFO: renamed from: ۙ */
    public void mo1209(int i) {
        switch (this.f22084) {
            case 0:
                ((InterfaceC4361) this.f22085).mo12482((int) (i * 0.6f));
                break;
            default:
                ((C3087) this.f22085).mo16839(i);
                break;
        }
    }

    @Override // l.InterfaceC11615
    /* JADX INFO: renamed from: ۙ */
    public boolean mo13186(String str) {
        return ((String) this.f22085).equals(str);
    }

    @Override // l.InterfaceC21100
    /* JADX INFO: renamed from: ᩷ */
    public Bitmap mo6272() {
        return C8542.m22859((AbstractC22044) this.f22085).m24499();
    }
}
