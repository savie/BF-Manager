package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13226 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f43979 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f43980;

    public C13226(String str) {
        this.f43980 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32711(String... strArr) {
        for (String str : strArr) {
            Iterator it = this.f43979.iterator();
            while (it.hasNext()) {
                if (((C13226) it.next()).f43980.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m32712() {
        if (m32711("name")) {
            return this.f43979.size() == 1 || m32711("ExtendedData", "Point", "MultiGeometry", "Polygon");
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32710() {
        for (C13226 c13226 : this.f43979) {
            String str = c13226.f43980;
            if (!str.equals("name") && !str.equals("unknown") && !str.equals("visibility") && !str.equals("GroundOverlay")) {
                if (str.equals("Placemark")) {
                    if (!c13226.m32712()) {
                        return false;
                    }
                } else if (!str.equals("Folder") || !c13226.m32710()) {
                    return false;
                }
            }
        }
        return true;
    }
}
