package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ᩸۫, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB6H */
/* JADX INFO: loaded from: classes3.dex */
public final class C7429 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5304 f24446;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8614 f24447;

    public C7429(C8614 c8614) {
        this.f24447 = c8614;
        C5304 c5304 = new C5304(c8614.m23233());
        c5304.m15924();
        this.f24446 = c5304;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20344(C10411 c10411) {
        C5304 c5304 = this.f24446;
        c5304.m15919(c10411);
        c5304.m15913(R.string.MT_Protector);
        if (c10411.getSize() == -1) {
            c5304.m15909(Math.max(c10411.m26722().m6832(), 0L)).m49281(8);
        } else {
            c5304.m15922(c10411.getSize()).m49281(8);
            c5304.m15909(Math.max(c10411.m26722().m6832(), 0L));
        }
        if (c10411.getTime() != -1) {
            c5304.m15929(c10411.getTime()).m49281(8);
        }
        Integer numM6841 = c10411.m26722().m6841();
        if (numM6841 != null) {
            c5304.m15907(R.string.MT_Protector, String.format("%08X", Long.valueOf(((long) numM6841.intValue()) & 4294967295L)));
        }
        c5304.m15926();
        c5304.m15920();
        C10060.m26010(c5304.m15927(), this.f24447, c10411);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20345(final C10411 c10411) {
        C5304 c5304 = this.f24446;
        c5304.m15919(c10411);
        c5304.m15913(R.string.MT_Protector);
        if (c10411.getSize() == -1) {
            c5304.m15909(Math.max(c10411.m26722().m6832(), 0L)).m49281(8);
        } else {
            c5304.m15922(c10411.getSize()).m49281(8);
            c5304.m15909(Math.max(c10411.m26722().m6832(), 0L));
        }
        if (c10411.getTime() != -1) {
            c5304.m15929(c10411.getTime()).m49281(8);
        }
        c5304.m15908(R.string.MT_Protector, new InterfaceC10523() { // from class: l.ۡ᩸۫
            @Override // l.InterfaceC10523
            public final void accept(TextView textView) {
                C7429 c7429 = this.f31208;
                c7429.f24446.m15908(R.string.MT_Protector, new InterfaceC10523() { // from class: l.۠᩸۫
                    @Override // l.InterfaceC10523
                    public final void accept(TextView textView2) {
                        C22501.m50734(this.f29110.f24447.m23213().mo10174(), Collections.singletonList(c10411), textView, textView2);
                    }
                });
            }
        }).m49281(8);
        c5304.m15920();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20343(final List list) {
        C20766 c20766 = (C20766) this.f24447.m23213();
        C5304 c5304 = this.f24446;
        c5304.m15917(list);
        c5304.m15915(c20766.m20218(), (View.OnLongClickListener) null);
        Iterator it = list.iterator();
        long j = -1;
        long j2 = 0;
        while (it.hasNext()) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
            long size = interfaceC2386.getSize();
            if (size != -1) {
                if (j == -1) {
                    j = 0;
                }
                j += size;
            }
            long jM6832 = ((C10411) interfaceC2386).m26722().m6832();
            if (jM6832 != -1) {
                j2 += jM6832;
            }
        }
        if (j == -1) {
            c5304.m15909(j2).m49281(8);
        } else {
            c5304.m15922(j).m49281(8);
            c5304.m15909(j2);
        }
        c5304.m15908(R.string.MT_Protector, new InterfaceC10523() { // from class: l.֨᩸۫
            @Override // l.InterfaceC10523
            public final void accept(TextView textView) {
                C7429 c7429 = this.f5101;
                c7429.f24446.m15908(R.string.MT_Protector, new InterfaceC10523() { // from class: l.ۖ᩸۫
                    @Override // l.InterfaceC10523
                    public final void accept(TextView textView2) {
                        C22501.m50734(c7429.f24447.m23213().mo10174(), list, textView, textView2);
                    }
                }).m49281(8);
            }
        });
        c5304.m15920();
    }
}
