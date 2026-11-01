package l;

import android.content.Intent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I94M */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC11591 extends AbstractActivityC10490 {

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public String f38957;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f38958;

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ۙ */
    public final void mo7993(Exception exc) {
    }

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ۙۙ */
    public final String mo7994() {
        return "null";
    }

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "SyntaxPreviewActivity";
    }

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ۖۙ */
    public final boolean mo7992() {
        Intent intent = getIntent();
        this.f38957 = intent.getStringExtra("syntaxName");
        this.f38958 = C5553.m15309(intent);
        return this.f38957 != null;
    }

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ۨۙ */
    public final String mo7997() {
        return this.f38957;
    }

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ֫ */
    public final String mo25147() {
        return this.f38958.mo33986();
    }

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ܳ */
    public final String mo7998() {
        return this.f38958.getName();
    }

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ۢ */
    public final String mo26620() {
        return "TEMPORARY:" + this.f38957;
    }

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ۚۙ */
    public final String mo7995() {
        if (this.f38958.mo33975()) {
            return this.f38958.m46730();
        }
        return getString(R.string.MT_Protector);
    }

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ۨ */
    public final void mo7996(String str) {
        this.f38958.m46735(str);
    }
}
