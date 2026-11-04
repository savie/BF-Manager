package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15613 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f50734 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f50735;

    public C15613(String str) {
        this.f50735 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37344(String... strArr) {
        for (String str : strArr) {
            Iterator it = this.f50734.iterator();
            while (it.hasNext()) {
                if (((C15613) it.next()).f50735.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m37345() {
        if (m37344("name")) {
            return this.f50734.size() == 1 || m37344("ExtendedData", "Point", "MultiGeometry", "Polygon");
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37343() {
        for (C15613 c15613 : this.f50734) {
            String str = c15613.f50735;
            if (!str.equals("name") && !str.equals("unknown") && !str.equals("visibility") && !str.equals("GroundOverlay")) {
                if (str.equals("Placemark")) {
                    if (!c15613.m37345()) {
                        return false;
                    }
                } else if (!str.equals("Folder") || !c15613.m37343()) {
                    return false;
                }
            }
        }
        return true;
    }
}
