package l;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ܽۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17405 extends AbstractC13213 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f56588;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f56589;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f56590;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f56592;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f56594;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Uri f56595;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Bundle f56596;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f56598;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C12184 f56599;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashSet f56591 = new HashSet();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ArrayList f56593 = new ArrayList();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f56597 = true;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m40879() {
        m40878();
        this.f56599 = null;
        this.f56591.clear();
        this.f56593.clear();
        this.f56592 = null;
        this.f56595 = null;
        this.f56596 = null;
        this.f56598 = false;
        this.f56597 = true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m40878() {
        AbstractC22044 abstractC22044 = this.f56594;
        if (abstractC22044 != null) {
            if (".xml".equalsIgnoreCase(abstractC22044.m49864())) {
                C14584.m35193(this.f56594.mo4294() + ".arsc", new String[0]).mo4296();
            }
            this.f56594.mo4296();
            this.f56594 = null;
        }
        this.f56590 = null;
    }

    @Override // l.AbstractC13213
    /* JADX INFO: renamed from: ۤ */
    public final void mo6417() {
        m40878();
    }
}
