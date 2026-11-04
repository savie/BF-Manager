package l;

import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BJB */
/* JADX INFO: loaded from: classes3.dex */
public final class C7075 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C7075 f23303 = new C7075(null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f23304;

    public C7075(InterfaceC7206 interfaceC7206) {
        if (interfaceC7206 == null) {
            this.f23304 = Collections.EMPTY_LIST;
            return;
        }
        ArrayList arrayList = new ArrayList(interfaceC7206.mo15674());
        Iterator it = interfaceC7206.mo15672().iterator();
        while (it.hasNext()) {
            arrayList.add(new C8566((InterfaceC10869) it.next()));
        }
        this.f23304 = C4681.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2600 m19407(String str) {
        Iterator it = this.f23304.iterator();
        while (it.hasNext()) {
            C2600 c2600M23009 = ((C8566) it.next()).m23009(str);
            if (c2600M23009 != null) {
                return c2600M23009;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2600 m19406(int i) {
        Iterator it = this.f23304.iterator();
        while (it.hasNext()) {
            C2600 c2600M23008 = ((C8566) it.next()).m23008(i);
            if (c2600M23008 != null) {
                return c2600M23008;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2600 m19409(String str, boolean z) {
        C2600 c2600M23009;
        if (z) {
            for (C8566 c8566 : this.f23304) {
                if (c8566.m23010() == 1 && (c2600M23009 = c8566.m23009(str)) != null) {
                    return c2600M23009;
                }
            }
            return C15407.m36886().m19407(str);
        }
        return m19407(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2600 m19410(int i) {
        C2600 c2600M23008;
        int i2 = (i >>> 24) & 255;
        if (i2 != 1) {
            return m19406(i);
        }
        if (i2 != 1) {
            throw new IllegalArgumentException();
        }
        for (C8566 c8566 : this.f23304) {
            if (c8566.m23010() == 1 && (c2600M23008 = c8566.m23008(i)) != null) {
                return c2600M23008;
            }
        }
        return C15407.m36886().m19406(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2600 m19408(String str, String str2, Map map) {
        boolean zEquals = Chip.NAMESPACE_ANDROID.equals(str);
        C2600 c2600M19409 = m19409(str2, zEquals);
        if (c2600M19409 == null && str2.length() == 10 && str2.startsWith("id")) {
            String strSubstring = str2.substring(2);
            if (C11730.m29453(strSubstring)) {
                c2600M19409 = m19410(C11730.m29456(strSubstring));
            }
        }
        if (c2600M19409 == null && map != null) {
            c2600M19409 = (C2600) map.get(str + ":" + str2);
        }
        return (c2600M19409 != null || zEquals) ? c2600M19409 : C15407.m36886().m19407(str2);
    }
}
