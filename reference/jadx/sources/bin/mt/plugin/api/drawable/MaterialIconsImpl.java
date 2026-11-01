package bin.mt.plugin.api.drawable;

import android.graphics.drawable.Drawable;
import bin.mt.plugin.api.util.ServiceLoader;
import l.C0252;
import l.C0649;
import l.C21111;
import l.InterfaceC12691;

/* JADX INFO: loaded from: classes.dex */
public class MaterialIconsImpl implements InterfaceC12691 {
    public static void register() {
        ServiceLoader.register(InterfaceC12691.class, new MaterialIconsImpl());
    }

    @Override // l.InterfaceC12691
    public Drawable get(String str) {
        C21111 c21111M2944 = C0649.m2944(str, true);
        if (c21111M2944 != null) {
            return c21111M2944;
        }
        throw new IllegalArgumentException(C0252.m1693("Filled material icon not found: ", str));
    }

    @Override // l.InterfaceC12691
    public Drawable getOutlined(String str) {
        C21111 c21111M2944 = C0649.m2944(str, false);
        if (c21111M2944 != null) {
            return c21111M2944;
        }
        throw new IllegalArgumentException(C0252.m1693("Outlined material icon not found: ", str));
    }
}
