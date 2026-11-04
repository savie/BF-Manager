package l;

import android.content.Intent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: I94M */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC14587 extends AbstractActivityC22047 {

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public String f45970;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f45971;

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ۙ */
    public final void mo1385(Exception exc) {
    }

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ܳۙ */
    public final String mo1390() {
        return "null";
    }

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "SyntaxPreviewActivity";
    }

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ֫ۙ */
    public final boolean mo1384() {
        Intent intent = getIntent();
        this.f45970 = intent.getStringExtra("syntaxName");
        this.f45971 = C14584.m35190(intent);
        return this.f45970 != null;
    }

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ۚۙ */
    public final String mo1386() {
        return this.f45970;
    }

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final String mo35215() {
        return this.f45971.mo4294();
    }

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ᩷ۙ */
    public final String mo1392() {
        return this.f45971.getName();
    }

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final String mo35216() {
        return "TEMPORARY:" + this.f45970;
    }

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ۧۙ */
    public final String mo1388() {
        if (this.f45971.mo2934()) {
            return this.f45971.m49871();
        }
        return getString(R.string.MT_Protector);
    }

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ۤ */
    public final void mo1387(String str) {
        this.f45971.m49879(str);
    }
}
