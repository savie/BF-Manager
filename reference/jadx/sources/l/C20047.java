package l;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: l.᩶۠۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 86KX */
/* JADX INFO: loaded from: classes4.dex */
public final class C20047 extends Exception {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final List f64183;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f64184;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final List f64185;

    public C20047(String str, String str2, List list, List list2) {
        super(str2);
        this.f64184 = str;
        this.f64183 = C0561.unmodifiableList(new ArrayList(list));
        this.f64185 = C0561.unmodifiableList(new ArrayList(new LinkedHashSet(list2)));
    }
}
