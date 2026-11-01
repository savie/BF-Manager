package l;

import android.content.ContextWrapper;
import android.content.Intent;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۢ۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097X */
/* JADX INFO: loaded from: classes4.dex */
public class C9442 extends AbstractC23941 {

    /* JADX INFO: renamed from: ܳۖܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f31948 = {4975, 12796, 12782, 12793, 12778, 12750, 12796, 12767, 12782, 12795, 12775, 12774, 12769, 12799, 12794, 12795, 12767, 12782, 12795, 12775, 12734, 12774, 12769, 12799, 12794, 12795, 12767, 12782, 12795, 12775, 12733, 12774, 12779, 12733, 12769, 12782, 12770, 12778, 12774, 12776, 12769, 12768, 12797, 12778, 12750, 12779, 12779, 12736, 12797, 12747, 12778, 12771, 12774, 12769, 12777, 12768, 12705, 12773, 12796, 12768, 12769, 12793, 12778, 12797, 12796, 12774, 12768, 12769, 12748, 12768, 12779, 12778, 12777, 12774, 12771, 12778, 12733, 12777, 12774, 12771, 12778, 12734, 12782, 12791, 12770, 12771, 12795, 12790, 12799, 12778, 12781, 12704, 12782, 12704, -22589, 17461, -23283, 27157, 28661, -19578, -24061, 18705, -20314, 17167, 20919, -16583};

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f31949;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f31950 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public boolean f31951;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f31952;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31953;

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5720;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(R.string.MT_Protector, m41569("saveAsPath"), C16737.m39288(R.string.MT_Protector));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        m41562(R.string.MT_Protector);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 193221. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public l.C5202 mo3077() {
        /*
            Method dump skipped, instruction units count: 19322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9442.mo3077():l.ۚ۟ۜ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m24198(C2455 c2455, C6037 c6037, String str) throws Throwable {
        C20945 c20945M47094 = C20945.m47094(c2455.m7471(c2455.m7470(str)));
        c20945M47094.m47109(c6037, this.f31953, this.f31949);
        return c20945M47094.m47113();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        this.f31951 = true;
        m24199(main, c5202);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24199(ContextWrapper contextWrapper, C5202 c5202) {
        if (c5202.m14380()) {
            if (this.f31950.get() == 0) {
                this.f31952.mo24647();
                C15829.m37618(R.string.MT_Protector);
            } else {
                Intent intent = new Intent(contextWrapper, (Class<?>) ActivityC20431.class);
                intent.setData(this.f31952.m46732());
                intent.putExtra("savedAsPath", m41585("saveAsPath"));
                contextWrapper.startActivity(intent);
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        AbstractC20745 abstractC20745;
        if (!this.f31951) {
            m24199(C16737.m39277(), c5202);
        }
        if (!c5202.m14380() && (abstractC20745 = this.f31952) != null) {
            abstractC20745.mo24647();
        }
        AbstractC20745 abstractC20746 = this.f31949;
        if (abstractC20746 != null) {
            abstractC20746.mo24647();
        }
        C21094.m47530();
    }
}
