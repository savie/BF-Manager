package bin.mt.plugin.api.drawable;

import android.graphics.drawable.Drawable;
import bin.mt.plugin.api.util.ServiceLoader;
import l.InterfaceC12691;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialIcons {
    public static Drawable get(String str) {
        return ((InterfaceC12691) ServiceLoader.get(InterfaceC12691.class)).get(str);
    }

    public static Drawable getOutlined(String str) {
        return ((InterfaceC12691) ServiceLoader.get(InterfaceC12691.class)).getOutlined(str);
    }
}
