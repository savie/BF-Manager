package l;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes4.dex */
public final class C21923 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f71120;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f71121;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final CharSequence f71122;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16775 f71123;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Bundle f71124;

    public C21923(C16775 c16775, SpannableStringBuilder spannableStringBuilder) {
        Bundle bundle = new Bundle();
        this.f71121 = true;
        this.f71120 = true;
        this.f71123 = c16775;
        this.f71122 = C3577.m10573(spannableStringBuilder);
        this.f71124 = bundle;
        this.f71121 = true;
        this.f71120 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0755 m48750() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        return new C0755(this.f71123, this.f71122, null, this.f71124, arrayList2.isEmpty() ? null : (C2642[]) arrayList2.toArray(new C2642[arrayList2.size()]), arrayList.isEmpty() ? null : (C2642[]) arrayList.toArray(new C2642[arrayList.size()]), this.f71121, this.f71120);
    }
}
