package l;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: renamed from: l.ܶۖܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18KG */
/* JADX INFO: loaded from: classes5.dex */
public final class C14943 extends AbstractC16862 implements Handler.Callback {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public boolean f48725;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final C16033 f48726;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f48727;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public long f48728;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public C7648 f48729;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public C2717 f48730;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final Handler f48731;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f48732;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC5064 f48733;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f48734;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC3401 f48735;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public AbstractC5540 f48736;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f48737;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22704 f48738;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6475 f48739;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC5540 f48740;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public long f48741;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final C16808 f48742;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final C12526 f48743;

    @Override // l.InterfaceC4784, l.InterfaceC2667
    public final String getName() {
        return "TextRenderer";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14943(InterfaceC22704 interfaceC22704, Looper looper) {
        super(3);
        InterfaceC6475 interfaceC6475 = InterfaceC6475.f21852;
        this.f48738 = interfaceC22704;
        this.f48731 = looper == null ? null : new Handler(looper, this);
        this.f48739 = interfaceC6475;
        this.f48742 = new C16808();
        this.f48726 = new C16033(1, 0);
        this.f48743 = new C12526();
        this.f48728 = -9223372036854775807L;
        this.f48741 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m35692(long j) {
        C2023.m6510(mo13269());
        this.f48728 = j;
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۙ */
    public final void mo13950(C7648[] c7648Arr, long j, long j2, C15274 c15274) {
        InterfaceC5064 c12826;
        C7648 c7648 = c7648Arr[0];
        this.f48729 = c7648;
        if (!C13638.equals(c7648.f25265, "application/x-media3-cues")) {
            m35689();
            if (this.f48735 != null) {
                this.f48727 = 1;
                return;
            }
            this.f48725 = true;
            C7648 c7649 = this.f48729;
            c7649.getClass();
            InterfaceC3401 interfaceC3401M10759 = ((C3652) this.f48739).m10759(c7649);
            this.f48735 = interfaceC3401M10759;
            interfaceC3401M10759.mo26288(m39528());
            return;
        }
        if (this.f48729.f25252 == 1) {
            c12826 = new C0830();
        } else {
            c12826 = new C12826();
        }
        this.f48733 = c12826;
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۙ */
    public final void mo13942(long j, boolean z) {
        this.f48741 = j;
        InterfaceC5064 interfaceC5064 = this.f48733;
        if (interfaceC5064 != null) {
            interfaceC5064.clear();
        }
        m35691();
        this.f48734 = false;
        this.f48732 = false;
        this.f48728 = -9223372036854775807L;
        C7648 c7648 = this.f48729;
        if (c7648 == null || C13638.equals(c7648.f25265, "application/x-media3-cues")) {
            return;
        }
        if (this.f48727 == 0) {
            m35688();
            InterfaceC3401 interfaceC3401 = this.f48735;
            interfaceC3401.getClass();
            interfaceC3401.flush();
            interfaceC3401.mo26288(m39528());
            return;
        }
        m35688();
        InterfaceC3401 interfaceC3402 = this.f48735;
        interfaceC3402.getClass();
        interfaceC3402.mo14();
        this.f48735 = null;
        this.f48727 = 0;
        this.f48725 = true;
        C7648 c7649 = this.f48729;
        c7649.getClass();
        InterfaceC3401 interfaceC3401M10759 = ((C3652) this.f48739).m10759(c7649);
        this.f48735 = interfaceC3401M10759;
        interfaceC3401M10759.mo26288(m39528());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025f A[Catch: ۙᩴܰ -> 0x02c3, TryCatch #1 {ۙᩴܰ -> 0x02c3, blocks: (B:99:0x025b, B:101:0x025f, B:103:0x0263, B:106:0x0271, B:107:0x0273, B:109:0x0277, B:111:0x0288, B:113:0x028f, B:115:0x0295, B:120:0x02b0, B:122:0x02b4, B:116:0x029a, B:119:0x029f), top: B:132:0x025b }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0263 A[Catch: ۙᩴܰ -> 0x02c3, TryCatch #1 {ۙᩴܰ -> 0x02c3, blocks: (B:99:0x025b, B:101:0x025f, B:103:0x0263, B:106:0x0271, B:107:0x0273, B:109:0x0277, B:111:0x0288, B:113:0x028f, B:115:0x0295, B:120:0x02b0, B:122:0x02b4, B:116:0x029a, B:119:0x029f), top: B:132:0x025b }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0271 A[Catch: ۙᩴܰ -> 0x02c3, TryCatch #1 {ۙᩴܰ -> 0x02c3, blocks: (B:99:0x025b, B:101:0x025f, B:103:0x0263, B:106:0x0271, B:107:0x0273, B:109:0x0277, B:111:0x0288, B:113:0x028f, B:115:0x0295, B:120:0x02b0, B:122:0x02b4, B:116:0x029a, B:119:0x029f), top: B:132:0x025b }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0288 A[Catch: ۙᩴܰ -> 0x02c3, TryCatch #1 {ۙᩴܰ -> 0x02c3, blocks: (B:99:0x025b, B:101:0x025f, B:103:0x0263, B:106:0x0271, B:107:0x0273, B:109:0x0277, B:111:0x0288, B:113:0x028f, B:115:0x0295, B:120:0x02b0, B:122:0x02b4, B:116:0x029a, B:119:0x029f), top: B:132:0x025b }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0295 A[Catch: ۙᩴܰ -> 0x02c3, TryCatch #1 {ۙᩴܰ -> 0x02c3, blocks: (B:99:0x025b, B:101:0x025f, B:103:0x0263, B:106:0x0271, B:107:0x0273, B:109:0x0277, B:111:0x0288, B:113:0x028f, B:115:0x0295, B:120:0x02b0, B:122:0x02b4, B:116:0x029a, B:119:0x029f), top: B:132:0x025b }] */
    /* JADX WARN: Code duplicated, block: B:116:0x029a A[Catch: ۙᩴܰ -> 0x02c3, TryCatch #1 {ۙᩴܰ -> 0x02c3, blocks: (B:99:0x025b, B:101:0x025f, B:103:0x0263, B:106:0x0271, B:107:0x0273, B:109:0x0277, B:111:0x0288, B:113:0x028f, B:115:0x0295, B:120:0x02b0, B:122:0x02b4, B:116:0x029a, B:119:0x029f), top: B:132:0x025b }] */
    /* JADX WARN: Code duplicated, block: B:119:0x029f A[Catch: ۙᩴܰ -> 0x02c3, TryCatch #1 {ۙᩴܰ -> 0x02c3, blocks: (B:99:0x025b, B:101:0x025f, B:103:0x0263, B:106:0x0271, B:107:0x0273, B:109:0x0277, B:111:0x0288, B:113:0x028f, B:115:0x0295, B:120:0x02b0, B:122:0x02b4, B:116:0x029a, B:119:0x029f), top: B:132:0x025b }] */
    /* JADX WARN: Code duplicated, block: B:132:0x025b A[EXC_TOP_SPLITTER, LOOP:2: B:132:0x025b->B:144:0x025b, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x029e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x025b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x025b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0187  */
    /* JADX WARN: Code duplicated, block: B:59:0x018b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0194 A[LOOP:1: B:60:0x0190->B:62:0x0194, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x019f  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:82:0x0204  */
    /* JADX WARN: Code duplicated, block: B:91:0x0231  */
    /* JADX WARN: Code duplicated, block: B:94:0x0245  */
    /* JADX WARN: Code duplicated, block: B:95:0x024d  */
    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۙ */
    public final void mo13260(long j, long j2) {
        boolean z;
        AbstractC5540 abstractC5540;
        StringBuilder sb;
        C2717 c2717;
        int iM39515;
        C7648 c7648;
        int iMo15244;
        long jMo15245;
        C16841 c16841;
        AbstractC5540 abstractC5541;
        long jM35690;
        if (mo13269()) {
            long j3 = this.f48728;
            if (j3 != -9223372036854775807L && j >= j3) {
                m35688();
                this.f48732 = true;
            }
        }
        if (this.f48732) {
            return;
        }
        C7648 c7649 = this.f48729;
        c7649.getClass();
        boolean zEquals = C13638.equals(c7649.f25265, "application/x-media3-cues");
        InterfaceC22704 interfaceC22704 = this.f48738;
        Handler handler = this.f48731;
        C12526 c12526 = this.f48743;
        boolean zMo3424 = false;
        zMo3424 = false;
        zMo3424 = false;
        if (zEquals) {
            this.f48733.getClass();
            if (!this.f48734) {
                C16033 c16033 = this.f48726;
                if (m39515(c12526, c16033, 0) == -4) {
                    if (c16033.m42264()) {
                        this.f48734 = true;
                    } else {
                        c16033.m38025();
                        ByteBuffer byteBuffer = c16033.f51912;
                        byteBuffer.getClass();
                        long j4 = c16033.f51910;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.f48742.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(am.aF);
                        parcelableArrayList.getClass();
                        int i = AbstractC22433.f73217;
                        C4793 c4793 = new C4793();
                        for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i2);
                            bundle2.getClass();
                            c4793.m52163(C0612.m2813(bundle2));
                        }
                        C17513 c17513 = new C17513(j4, bundle.getLong("d"), c4793.m13309());
                        c16033.mo7();
                        zMo3424 = this.f48733.mo3424(c17513, j);
                    }
                }
            }
            long jMo3425 = this.f48733.mo3425(this.f48741);
            if (jMo3425 == Long.MIN_VALUE && this.f48734 && !zMo3424) {
                this.f48732 = true;
            }
            if (jMo3425 != Long.MIN_VALUE && jMo3425 <= j) {
                zMo3424 = true;
            }
            if (zMo3424) {
                AbstractC22433 abstractC22433Mo3423 = this.f48733.mo3423(j);
                long jMo3426 = this.f48733.mo3426(j);
                m35687(jMo3426);
                C16841 c16842 = new C16841(abstractC22433Mo3423);
                if (handler != null) {
                    handler.obtainMessage(1, c16842).sendToTarget();
                } else {
                    interfaceC22704.mo11572(c16842.f53889);
                    interfaceC22704.mo11578(c16842);
                }
                this.f48733.mo3422(jMo3426);
            }
            this.f48741 = j;
            return;
        }
        m35689();
        this.f48741 = j;
        AbstractC5540 abstractC5542 = this.f48736;
        InterfaceC6475 interfaceC6475 = this.f48739;
        if (abstractC5542 != null) {
            if (getState() != 2) {
                return;
            }
            if (this.f48740 != null) {
                jM35690 = m35690();
                z = false;
                while (jM35690 <= j) {
                    this.f48737++;
                    jM35690 = m35690();
                    z = true;
                }
            } else {
                z = false;
            }
            abstractC5540 = this.f48736;
            if (abstractC5540 != null) {
                if (abstractC5540.m42264()) {
                    if (!z) {
                        if (this.f48727 == 2) {
                            m35688();
                            InterfaceC3401 interfaceC3401 = this.f48735;
                            interfaceC3401.getClass();
                            interfaceC3401.mo14();
                            this.f48735 = null;
                            this.f48727 = 0;
                            this.f48725 = true;
                            C7648 c76410 = this.f48729;
                            c76410.getClass();
                            InterfaceC3401 interfaceC3401M10759 = ((C3652) interfaceC6475).m10759(c76410);
                            this.f48735 = interfaceC3401M10759;
                            interfaceC3401M10759.mo26288(m39528());
                        } else {
                            m35688();
                            this.f48732 = true;
                        }
                    }
                } else if (abstractC5540.f2202 <= j) {
                    abstractC5541 = this.f48740;
                    if (abstractC5541 != null) {
                        abstractC5541.mo8();
                    }
                    this.f48737 = abstractC5540.mo15244(j);
                    this.f48740 = abstractC5540;
                    this.f48736 = null;
                    z = true;
                }
            }
            if (z) {
                this.f48740.getClass();
                iMo15244 = this.f48740.mo15244(j);
                if (iMo15244 != 0) {
                    jMo15245 = this.f48740.f2202;
                } else {
                    jMo15245 = this.f48740.f2202;
                }
                m35687(jMo15245);
                c16841 = new C16841(this.f48740.mo15247(j));
                if (handler != null) {
                    handler.obtainMessage(1, c16841).sendToTarget();
                } else {
                    interfaceC22704.mo11572(c16841.f53889);
                    interfaceC22704.mo11578(c16841);
                }
            }
            if (this.f48727 == 2) {
                return;
            }
            while (!this.f48734) {
                c2717 = this.f48730;
                if (c2717 == null) {
                    InterfaceC3401 interfaceC3402 = this.f48735;
                    interfaceC3402.getClass();
                    c2717 = (C2717) interfaceC3402.mo26287();
                    if (c2717 == null) {
                        return;
                    } else {
                        this.f48730 = c2717;
                    }
                }
                if (this.f48727 == 1) {
                    c2717.m42267(4);
                    InterfaceC3401 interfaceC3403 = this.f48735;
                    interfaceC3403.getClass();
                    interfaceC3403.mo26286(c2717);
                    this.f48730 = null;
                    this.f48727 = 2;
                    return;
                }
                iM39515 = m39515(c12526, c2717, 0);
                if (iM39515 == -4) {
                    if (c2717.m42264()) {
                        this.f48734 = true;
                        this.f48725 = false;
                    } else {
                        c7648 = c12526.f41899;
                        if (c7648 == null) {
                            return;
                        }
                        c2717.f10456 = c7648.f25278;
                        c2717.m38025();
                        this.f48725 &= !c2717.m42269();
                    }
                    if (!this.f48725) {
                        InterfaceC3401 interfaceC3404 = this.f48735;
                        interfaceC3404.getClass();
                        interfaceC3404.mo26286(c2717);
                        this.f48730 = null;
                    }
                } else if (iM39515 == -3) {
                    return;
                }
            }
            return;
        }
        InterfaceC3401 interfaceC3405 = this.f48735;
        interfaceC3405.getClass();
        interfaceC3405.mo6405(j);
        try {
            InterfaceC3401 interfaceC3406 = this.f48735;
            interfaceC3406.getClass();
            this.f48736 = (AbstractC5540) interfaceC3406.mo21899();
            if (getState() != 2) {
                return;
            }
            if (this.f48740 != null) {
                jM35690 = m35690();
                z = false;
                while (jM35690 <= j) {
                    this.f48737++;
                    jM35690 = m35690();
                    z = true;
                }
            } else {
                z = false;
            }
            abstractC5540 = this.f48736;
            if (abstractC5540 != null) {
                if (abstractC5540.m42264()) {
                    if (!z && m35690() == C17492.FOREVER_NS) {
                        if (this.f48727 == 2) {
                            m35688();
                            InterfaceC3401 interfaceC3407 = this.f48735;
                            interfaceC3407.getClass();
                            interfaceC3407.mo14();
                            this.f48735 = null;
                            this.f48727 = 0;
                            this.f48725 = true;
                            C7648 c76411 = this.f48729;
                            c76411.getClass();
                            InterfaceC3401 interfaceC3401M107510 = ((C3652) interfaceC6475).m10759(c76411);
                            this.f48735 = interfaceC3401M107510;
                            interfaceC3401M107510.mo26288(m39528());
                        } else {
                            m35688();
                            this.f48732 = true;
                        }
                    }
                } else if (abstractC5540.f2202 <= j) {
                    abstractC5541 = this.f48740;
                    if (abstractC5541 != null) {
                        abstractC5541.mo8();
                    }
                    this.f48737 = abstractC5540.mo15244(j);
                    this.f48740 = abstractC5540;
                    this.f48736 = null;
                    z = true;
                }
            }
            if (z) {
                this.f48740.getClass();
                iMo15244 = this.f48740.mo15244(j);
                if (iMo15244 != 0 || this.f48740.mo15243() == 0) {
                    jMo15245 = this.f48740.f2202;
                } else if (iMo15244 == -1) {
                    AbstractC5540 abstractC5543 = this.f48740;
                    jMo15245 = abstractC5543.mo15245(abstractC5543.mo15243() - 1);
                } else {
                    jMo15245 = this.f48740.mo15245(iMo15244 - 1);
                }
                m35687(jMo15245);
                c16841 = new C16841(this.f48740.mo15247(j));
                if (handler != null) {
                    handler.obtainMessage(1, c16841).sendToTarget();
                } else {
                    interfaceC22704.mo11572(c16841.f53889);
                    interfaceC22704.mo11578(c16841);
                }
            }
            if (this.f48727 == 2) {
                return;
            }
            while (!this.f48734) {
                try {
                    c2717 = this.f48730;
                    if (c2717 == null) {
                        InterfaceC3401 interfaceC3408 = this.f48735;
                        interfaceC3408.getClass();
                        c2717 = (C2717) interfaceC3408.mo26287();
                        if (c2717 == null) {
                            return;
                        } else {
                            this.f48730 = c2717;
                        }
                    }
                    if (this.f48727 == 1) {
                        c2717.m42267(4);
                        InterfaceC3401 interfaceC3409 = this.f48735;
                        interfaceC3409.getClass();
                        interfaceC3409.mo26286(c2717);
                        this.f48730 = null;
                        this.f48727 = 2;
                        return;
                    }
                    iM39515 = m39515(c12526, c2717, 0);
                    if (iM39515 == -4) {
                        if (c2717.m42264()) {
                            this.f48734 = true;
                            this.f48725 = false;
                        } else {
                            c7648 = c12526.f41899;
                            if (c7648 == null) {
                                return;
                            }
                            c2717.f10456 = c7648.f25278;
                            c2717.m38025();
                            this.f48725 &= !c2717.m42269();
                        }
                        if (!this.f48725) {
                            InterfaceC3401 interfaceC34010 = this.f48735;
                            interfaceC34010.getClass();
                            interfaceC34010.mo26286(c2717);
                            this.f48730 = null;
                        }
                    } else if (iM39515 == -3) {
                        return;
                    }
                } catch (C4834 e) {
                    e = e;
                    sb = new StringBuilder("Subtitle decoding failed. streamFormat=");
                }
            }
            return;
        } catch (C4834 e2) {
            e = e2;
            sb = new StringBuilder("Subtitle decoding failed. streamFormat=");
        }
        sb.append(this.f48729);
        C0303.m1854(sb.toString(), e);
        m35691();
        m35688();
        InterfaceC3401 interfaceC34011 = this.f48735;
        interfaceC34011.getClass();
        interfaceC34011.mo14();
        this.f48735 = null;
        this.f48727 = 0;
        this.f48725 = true;
        C7648 c76412 = this.f48729;
        c76412.getClass();
        InterfaceC3401 interfaceC3401M107511 = ((C3652) interfaceC6475).m10759(c76412);
        this.f48735 = interfaceC3401M107511;
        interfaceC3401M107511.mo26288(m39528());
    }

    @Override // l.AbstractC16862
    /* JADX INFO: renamed from: ۧ */
    public final void mo13958() {
        this.f48729 = null;
        this.f48728 = -9223372036854775807L;
        m35691();
        this.f48741 = -9223372036854775807L;
        if (this.f48735 != null) {
            m35688();
            InterfaceC3401 interfaceC3401 = this.f48735;
            interfaceC3401.getClass();
            interfaceC3401.mo14();
            this.f48735 = null;
            this.f48727 = 0;
        }
    }

    @Override // l.AbstractC16862, l.InterfaceC4784
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo13268() {
        return this.f48732;
    }

    @Override // l.InterfaceC4784
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo13264() {
        C7648 c7648 = this.f48729;
        if (c7648 != null) {
            if (C13638.equals(c7648.f25265, "application/x-media3-cues")) {
                InterfaceC5064 interfaceC5064 = this.f48733;
                interfaceC5064.getClass();
                if (interfaceC5064.mo3425(this.f48741) == Long.MIN_VALUE) {
                    try {
                        mo13274();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (!this.f48732) {
                    if (this.f48734) {
                        AbstractC5540 abstractC5540 = this.f48740;
                        long j = this.f48741;
                        if (abstractC5540 == null || abstractC5540.mo15243() <= 0 || abstractC5540.mo15245(abstractC5540.mo15243() - 1) <= j) {
                            AbstractC5540 abstractC5541 = this.f48736;
                            long j2 = this.f48741;
                            if ((abstractC5541 == null || abstractC5541.mo15243() <= 0 || abstractC5541.mo15245(abstractC5541.mo15243() - 1) <= j2) && this.f48730 != null) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    private void m35688() {
        this.f48730 = null;
        this.f48737 = -1;
        AbstractC5540 abstractC5540 = this.f48740;
        if (abstractC5540 != null) {
            abstractC5540.mo8();
            this.f48740 = null;
        }
        AbstractC5540 abstractC5541 = this.f48736;
        if (abstractC5541 != null) {
            abstractC5541.mo8();
            this.f48736 = null;
        }
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    private long m35690() {
        if (this.f48737 == -1) {
            return C17492.FOREVER_NS;
        }
        this.f48740.getClass();
        return this.f48737 >= this.f48740.mo15243() ? C17492.FOREVER_NS : this.f48740.mo15245(this.f48737);
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    private void m35691() {
        AbstractC22433 abstractC22433Of = AbstractC22433.of();
        m35687(this.f48741);
        C16841 c16841 = new C16841(abstractC22433Of);
        Handler handler = this.f48731;
        if (handler != null) {
            handler.obtainMessage(1, c16841).sendToTarget();
            return;
        }
        AbstractC22433 abstractC22433 = c16841.f53889;
        InterfaceC22704 interfaceC22704 = this.f48738;
        interfaceC22704.mo11572(abstractC22433);
        interfaceC22704.mo11578(c16841);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            C16841 c16841 = (C16841) message.obj;
            AbstractC22433 abstractC22433 = c16841.f53889;
            InterfaceC22704 interfaceC22704 = this.f48738;
            interfaceC22704.mo11572(abstractC22433);
            interfaceC22704.mo11578(c16841);
            return true;
        }
        throw new IllegalStateException();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private long m35687(long j) {
        C2023.m6510(j != -9223372036854775807L);
        return j - m39522();
    }

    @RequiresNonNull({"streamFormat"})
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    private void m35689() {
        C2023.m6509("Legacy decoding is disabled, can't handle " + this.f48729.f25265 + " samples (expected application/x-media3-cues).", C13638.equals(this.f48729.f25265, "application/cea-608") || C13638.equals(this.f48729.f25265, "application/x-mp4-cea-608") || C13638.equals(this.f48729.f25265, "application/cea-708"));
    }

    @Override // l.InterfaceC2667
    /* JADX INFO: renamed from: ۙ */
    public final int mo8212(C7648 c7648) {
        if (C13638.equals(c7648.f25265, "application/x-media3-cues") || ((C3652) this.f48739).m10760(c7648)) {
            return C13958.m33811(c7648.f25245 == 0 ? 4 : 2, 0, 0, 0);
        }
        return C6632.m17977(c7648.f25265) ? C13958.m33811(1, 0, 0, 0) : C13958.m33811(0, 0, 0, 0);
    }
}
