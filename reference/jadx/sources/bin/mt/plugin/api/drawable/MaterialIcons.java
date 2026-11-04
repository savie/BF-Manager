package bin.mt.plugin.api.drawable;

import android.graphics.drawable.Drawable;
import bin.mt.plugin.api.util.ServiceLoader;
import l.InterfaceC15888;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialIcons {
    public static Drawable get(String str) {
        return ((InterfaceC15888) ServiceLoader.get(InterfaceC15888.class)).get(str);
    }

    public static Drawable getOutlined(String str) {
        return ((InterfaceC15888) ServiceLoader.get(InterfaceC15888.class)).getOutlined(str);
    }
}
