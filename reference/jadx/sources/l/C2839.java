package l;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۖᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86KX */
/* JADX INFO: loaded from: classes2.dex */
public final class C2839 extends Exception {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f9349;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List f9350;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final List f9351;

    public C2839(String str, String str2, List list, List list2) {
        super(str2);
        this.f9349 = str;
        this.f9350 = C4681.unmodifiableList(new ArrayList(list));
        this.f9351 = C4681.unmodifiableList(new ArrayList(new LinkedHashSet(list2)));
    }
}
