package l;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes4.dex */
public final class C17728 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f58253;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9545 f58254;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final CharSequence f58255;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Bundle f58256;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f58257;

    public C17728(C9545 c9545, SpannableStringBuilder spannableStringBuilder) {
        Bundle bundle = new Bundle();
        this.f58253 = true;
        this.f58257 = true;
        this.f58254 = c9545;
        this.f58255 = C3558.m11588(spannableStringBuilder);
        this.f58256 = bundle;
        this.f58253 = true;
        this.f58257 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16236 m41515() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        return new C16236(this.f58254, this.f58255, null, this.f58256, arrayList2.isEmpty() ? null : (C24663[]) arrayList2.toArray(new C24663[arrayList2.size()]), arrayList.isEmpty() ? null : (C24663[]) arrayList.toArray(new C24663[arrayList.size()]), this.f58253, this.f58257);
    }
}
