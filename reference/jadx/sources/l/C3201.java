package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB6H */
/* JADX INFO: loaded from: classes2.dex */
public final class C3201 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22149 f11985;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11545 f11986;

    public C3201(C11545 c11545) {
        this.f11986 = c11545;
        C22149 c22149 = new C22149(c11545.m28824());
        c22149.m49138();
        this.f11985 = c22149;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9620(C10964 c10964) {
        C22149 c22149 = this.f11985;
        c22149.m49153(c10964);
        c22149.m49148(R.string.MT_Protector);
        if (c10964.getSize() == -1) {
            c22149.m49144(Math.max(c10964.m27721().m42571(), 0L)).m9599(8);
        } else {
            c22149.m49157(c10964.getSize()).m9599(8);
            c22149.m49144(Math.max(c10964.m27721().m42571(), 0L));
        }
        if (c10964.getTime() != -1) {
            c22149.m49162(c10964.getTime()).m9599(8);
        }
        Integer numM42578 = c10964.m27721().m42578();
        if (numM42578 != null) {
            c22149.m49142(R.string.MT_Protector, String.format("%08X", Long.valueOf(((long) numM42578.intValue()) & 4294967295L)));
        }
        c22149.m49155();
        c22149.m49159();
        C23519.m51792(c22149.m49160(), this.f11986, c10964);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m9621(final C10964 c10964) {
        C22149 c22149 = this.f11985;
        c22149.m49153(c10964);
        c22149.m49148(R.string.MT_Protector);
        if (c10964.getSize() == -1) {
            c22149.m49144(Math.max(c10964.m27721().m42571(), 0L)).m9599(8);
        } else {
            c22149.m49157(c10964.getSize()).m9599(8);
            c22149.m49144(Math.max(c10964.m27721().m42571(), 0L));
        }
        if (c10964.getTime() != -1) {
            c22149.m49162(c10964.getTime()).m9599(8);
        }
        c22149.m49143(R.string.MT_Protector, new InterfaceC4509() { // from class: l.ܳۧ᩹
            @Override // l.InterfaceC4509
            /* JADX INFO: renamed from: ۙ */
            public final void mo4354(TextView textView) {
                C3201 c3201 = this.f47472;
                c3201.f11985.m49143(R.string.MT_Protector, new InterfaceC4509() { // from class: l.ۢۧ᩹
                    @Override // l.InterfaceC4509
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo4354(TextView textView2) {
                        C13913.m33747(textView, textView2, this.f32250.f11986.m28817().mo13029(), Collections.singletonList(c10964));
                    }
                });
            }
        }).m9599(8);
        c22149.m49159();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9619(final List list) {
        C9221 c9221 = (C9221) this.f11986.m28817();
        C22149 c22149 = this.f11985;
        c22149.m49152(list);
        c22149.m49150(c9221.m28629(), (View.OnLongClickListener) null);
        Iterator it = list.iterator();
        long j = -1;
        long j2 = 0;
        while (it.hasNext()) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
            long size = interfaceC2557.getSize();
            if (size != -1) {
                if (j == -1) {
                    j = 0;
                }
                j += size;
            }
            long jM42571 = ((C10964) interfaceC2557).m27721().m42571();
            if (jM42571 != -1) {
                j2 += jM42571;
            }
        }
        if (j == -1) {
            c22149.m49144(j2).m9599(8);
        } else {
            c22149.m49157(j).m9599(8);
            c22149.m49144(j2);
        }
        c22149.m49143(R.string.MT_Protector, new InterfaceC4509() { // from class: l.᩻ۧ᩹
            @Override // l.InterfaceC4509
            /* JADX INFO: renamed from: ۙ */
            public final void mo4354(TextView textView) {
                C3201 c3201 = this.f76590;
                c3201.f11985.m49143(R.string.MT_Protector, new InterfaceC4509() { // from class: l.֫ۧ᩹
                    @Override // l.InterfaceC4509
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo4354(TextView textView2) {
                        C13913.m33747(textView, textView2, this.f6940.f11986.m28817().mo13029(), list);
                    }
                }).m9599(8);
            }
        });
        c22149.m49159();
    }
}
