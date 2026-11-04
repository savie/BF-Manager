package bin.mt.plugin.api.drawable;

import android.graphics.drawable.Drawable;
import bin.mt.plugin.api.util.ServiceLoader;
import l.C14538;
import l.C24236;
import l.C25272;
import l.InterfaceC15888;

/* JADX INFO: loaded from: classes.dex */
public class MaterialIconsImpl implements InterfaceC15888 {
    public static void register() {
        ServiceLoader.register(InterfaceC15888.class, new MaterialIconsImpl());
    }

    @Override // l.InterfaceC15888
    public Drawable get(String str) {
        C24236 c24236M35076 = C14538.m35076(str, true);
        if (c24236M35076 != null) {
            return c24236M35076;
        }
        throw new IllegalArgumentException(C25272.m56409("Filled material icon not found: ", str));
    }

    @Override // l.InterfaceC15888
    public Drawable getOutlined(String str) {
        C24236 c24236M35076 = C14538.m35076(str, false);
        if (c24236M35076 != null) {
            return c24236M35076;
        }
        throw new IllegalArgumentException(C25272.m56409("Outlined material icon not found: ", str));
    }
}
