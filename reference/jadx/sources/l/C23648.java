package l;

import android.view.MenuItem;
import bin.mt.function.ar.ActivityRecordService;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: l.᩻ۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23648 implements InterfaceC1466, InterfaceC21133, InterfaceC20544, InterfaceC0380, InterfaceC7728, InterfaceC3740 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76573;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f76574;

    public /* synthetic */ C23648(int i, Object obj) {
        this.f76573 = i;
        this.f76574 = obj;
    }

    @Override // l.InterfaceC21133
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f76573) {
            case 2:
                ActivityRecordService.m43((ActivityRecordService) this.f76574, menuItem);
                break;
            default:
                C19015.m43732((C19015) this.f76574, menuItem);
                break;
        }
        return true;
    }

    @Override // l.InterfaceC0380
    /* JADX INFO: renamed from: ۙ */
    public void mo1825(Object obj) {
        switch (this.f76573) {
            case 5:
                ViewOnClickListenerC15847.m37717((ViewOnClickListenerC15847) this.f76574, (Integer) obj);
                break;
            default:
                ((C22032) this.f76574).m48923((C14500) obj, false);
                break;
        }
    }

    @Override // l.InterfaceC7728
    /* JADX INFO: renamed from: ۙ */
    public void mo11010(C16195 c16195) {
        ViewOnClickListenerC3520.m10373((ViewOnClickListenerC3520) this.f76574);
    }

    @Override // l.InterfaceC20544
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2120(String str) {
        return ((String) this.f76574).equals(str);
    }

    @Override // l.InterfaceC3740
    /* JADX INFO: renamed from: ܰ */
    public Object mo1620() {
        Constructor constructor = (Constructor) this.f76574;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            int i = C17023.f54385;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + C17023.m39791(constructor) + "' with no args", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke constructor '" + C17023.m39791(constructor) + "' with no args", e3.getCause());
        }
    }
}
