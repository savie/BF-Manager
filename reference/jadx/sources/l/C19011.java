package l;

import android.view.View;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ᩳۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19011 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public View f61575;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Supplier f61576;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10060 f61577;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f61578;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public View f61579;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f61580;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23255 f61581;

    public C19011(C10060 c10060, int i, String str, Supplier supplier) {
        this.f61577 = c10060;
        this.f61578 = i;
        this.f61580 = str;
        this.f61576 = supplier;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44099(int i, int i2, int i3, View view) {
        View viewFindViewById = view.findViewById(i);
        C17359.requireNonNull(viewFindViewById);
        this.f61579 = viewFindViewById;
        C23255 c23255 = (C23255) view.findViewById(i2);
        C17359.requireNonNull(c23255);
        this.f61581 = c23255;
        c23255.m52312();
        View viewFindViewById2 = view.findViewById(i3);
        C17359.requireNonNull(viewFindViewById2);
        this.f61575 = viewFindViewById2;
        this.f61581.m54107(true);
        this.f61575.setOnClickListener(new View.OnClickListener() { // from class: l.۟ۤ۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C19011 c19011 = this.f26061;
                C10060 c10060 = c19011.f61577;
                String strM2142 = c10060.f32252.m2142(c19011.f61578);
                if (strM2142 != null) {
                    C21576.m49067((CharSequence) (c10060.f32255 ? strM2142.toUpperCase() : strM2142.toLowerCase()));
                }
            }
        });
        m44098();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44098() {
        C10060 c10060 = this.f61577;
        C0366 c0366 = c10060.f32252;
        int i = this.f61578;
        String strM2142 = c0366.m2142(i);
        boolean z = c10060.f32252.m2141(i) && strM2142 != null;
        this.f61579.setVisibility(z ? 0 : 8);
        this.f61581.setVisibility(z ? 0 : 8);
        this.f61575.setVisibility(z ? 0 : 8);
        if (z) {
            this.f61581.mo52335((CharSequence) (c10060.f32255 ? strM2142.toUpperCase() : strM2142.toLowerCase()));
        }
    }
}
