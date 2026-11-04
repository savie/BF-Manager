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

/* JADX INFO: renamed from: l.۠ۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 18KG */
/* JADX INFO: loaded from: classes4.dex */
public final class C8576 extends AbstractC25280 implements Handler.Callback {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public int f27993;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public C0526 f27994;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public AbstractC7984 f27995;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC0373 f27996;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public boolean f27997;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public long f27998;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final Handler f27999;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final C5690 f28000;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC4255 f28001;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final C16933 f28002;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public AbstractC7984 f28003;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f28004;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public long f28005;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public boolean f28006;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2610 f28007;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9321 f28008;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f28009;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public C15648 f28010;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final C16461 f28011;

    @Override // l.InterfaceC4002, l.InterfaceC18172
    public final String getName() {
        return "TextRenderer";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8576(InterfaceC2610 interfaceC2610, Looper looper) {
        super(3);
        InterfaceC9321 interfaceC9321 = InterfaceC9321.f30290;
        this.f28007 = interfaceC2610;
        this.f27999 = looper == null ? null : new Handler(looper, this);
        this.f28008 = interfaceC9321;
        this.f28002 = new C16933();
        this.f28000 = new C5690(1, 0);
        this.f28011 = new C16461();
        this.f27998 = -9223372036854775807L;
        this.f28005 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m23030(long j) {
        C20782.m47568(mo12951());
        this.f27998 = j;
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۙ */
    public final void mo11188(C15648[] c15648Arr, long j, long j2, C8402 c8402) {
        InterfaceC0373 c10067;
        C15648 c15648 = c15648Arr[0];
        this.f28010 = c15648;
        if (!C17359.equals(c15648.f50848, "application/x-media3-cues")) {
            m23025();
            if (this.f28001 != null) {
                this.f27993 = 1;
                return;
            }
            this.f28006 = true;
            C15648 c15649 = this.f28010;
            c15649.getClass();
            InterfaceC4255 interfaceC4255M4156 = ((C1119) this.f28008).m4156(c15649);
            this.f28001 = interfaceC4255M4156;
            interfaceC4255M4156.mo39839(m56453());
            return;
        }
        if (this.f28010.f50830 == 1) {
            c10067 = new C19018();
        } else {
            c10067 = new C10067();
        }
        this.f27996 = c10067;
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۙ */
    public final void mo11187(long j, boolean z) {
        this.f28005 = j;
        InterfaceC0373 interfaceC0373 = this.f27996;
        if (interfaceC0373 != null) {
            interfaceC0373.clear();
        }
        m23027();
        this.f28004 = false;
        this.f27997 = false;
        this.f27998 = -9223372036854775807L;
        C15648 c15648 = this.f28010;
        if (c15648 == null || C17359.equals(c15648.f50848, "application/x-media3-cues")) {
            return;
        }
        if (this.f27993 == 0) {
            m23029();
            InterfaceC4255 interfaceC4255 = this.f28001;
            interfaceC4255.getClass();
            interfaceC4255.flush();
            interfaceC4255.mo39839(m56453());
            return;
        }
        m23029();
        InterfaceC4255 interfaceC4256 = this.f28001;
        interfaceC4256.getClass();
        interfaceC4256.mo12();
        this.f28001 = null;
        this.f27993 = 0;
        this.f28006 = true;
        C15648 c15649 = this.f28010;
        c15649.getClass();
        InterfaceC4255 interfaceC4255M4156 = ((C1119) this.f28008).m4156(c15649);
        this.f28001 = interfaceC4255M4156;
        interfaceC4255M4156.mo39839(m56453());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025f A[Catch: ܰܶ᩷ -> 0x02c3, TryCatch #0 {ܰܶ᩷ -> 0x02c3, blocks: (B:99:0x025b, B:101:0x025f, B:103:0x0263, B:106:0x0271, B:107:0x0273, B:109:0x0277, B:111:0x0288, B:113:0x028f, B:115:0x0295, B:120:0x02b0, B:122:0x02b4, B:116:0x029a, B:119:0x029f), top: B:130:0x025b }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0263 A[Catch: ܰܶ᩷ -> 0x02c3, TryCatch #0 {ܰܶ᩷ -> 0x02c3, blocks: (B:99:0x025b, B:101:0x025f, B:103:0x0263, B:106:0x0271, B:107:0x0273, B:109:0x0277, B:111:0x0288, B:113:0x028f, B:115:0x0295, B:120:0x02b0, B:122:0x02b4, B:116:0x029a, B:119:0x029f), top: B:130:0x025b }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0271 A[Catch: ܰܶ᩷ -> 0x02c3, TryCatch #0 {ܰܶ᩷ -> 0x02c3, blocks: (B:99:0x025b, B:101:0x025f, B:103:0x0263, B:106:0x0271, B:107:0x0273, B:109:0x0277, B:111:0x0288, B:113:0x028f, B:115:0x0295, B:120:0x02b0, B:122:0x02b4, B:116:0x029a, B:119:0x029f), top: B:130:0x025b }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0288 A[Catch: ܰܶ᩷ -> 0x02c3, TryCatch #0 {ܰܶ᩷ -> 0x02c3, blocks: (B:99:0x025b, B:101:0x025f, B:103:0x0263, B:106:0x0271, B:107:0x0273, B:109:0x0277, B:111:0x0288, B:113:0x028f, B:115:0x0295, B:120:0x02b0, B:122:0x02b4, B:116:0x029a, B:119:0x029f), top: B:130:0x025b }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0295 A[Catch: ܰܶ᩷ -> 0x02c3, TryCatch #0 {ܰܶ᩷ -> 0x02c3, blocks: (B:99:0x025b, B:101:0x025f, B:103:0x0263, B:106:0x0271, B:107:0x0273, B:109:0x0277, B:111:0x0288, B:113:0x028f, B:115:0x0295, B:120:0x02b0, B:122:0x02b4, B:116:0x029a, B:119:0x029f), top: B:130:0x025b }] */
    /* JADX WARN: Code duplicated, block: B:116:0x029a A[Catch: ܰܶ᩷ -> 0x02c3, TryCatch #0 {ܰܶ᩷ -> 0x02c3, blocks: (B:99:0x025b, B:101:0x025f, B:103:0x0263, B:106:0x0271, B:107:0x0273, B:109:0x0277, B:111:0x0288, B:113:0x028f, B:115:0x0295, B:120:0x02b0, B:122:0x02b4, B:116:0x029a, B:119:0x029f), top: B:130:0x025b }] */
    /* JADX WARN: Code duplicated, block: B:119:0x029f A[Catch: ܰܶ᩷ -> 0x02c3, TryCatch #0 {ܰܶ᩷ -> 0x02c3, blocks: (B:99:0x025b, B:101:0x025f, B:103:0x0263, B:106:0x0271, B:107:0x0273, B:109:0x0277, B:111:0x0288, B:113:0x028f, B:115:0x0295, B:120:0x02b0, B:122:0x02b4, B:116:0x029a, B:119:0x029f), top: B:130:0x025b }] */
    /* JADX WARN: Code duplicated, block: B:130:0x025b A[EXC_TOP_SPLITTER, LOOP:2: B:130:0x025b->B:144:0x025b, LOOP_START, SYNTHETIC] */
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
    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ۙ */
    public final void mo11186(long j, long j2) {
        boolean z;
        AbstractC7984 abstractC7984;
        StringBuilder sb;
        C0526 c0526;
        int iM56443;
        C15648 c15648;
        int iMo21768;
        long jMo21769;
        C11831 c11831;
        AbstractC7984 abstractC7985;
        long jM23026;
        if (mo12951()) {
            long j3 = this.f27998;
            if (j3 != -9223372036854775807L && j >= j3) {
                m23029();
                this.f27997 = true;
            }
        }
        if (this.f27997) {
            return;
        }
        C15648 c15649 = this.f28010;
        c15649.getClass();
        boolean zEquals = C17359.equals(c15649.f50848, "application/x-media3-cues");
        InterfaceC2610 interfaceC2610 = this.f28007;
        Handler handler = this.f27999;
        C16461 c16461 = this.f28011;
        boolean zMo2165 = false;
        zMo2165 = false;
        zMo2165 = false;
        if (zEquals) {
            this.f27996.getClass();
            if (!this.f28004) {
                C5690 c5690 = this.f28000;
                if (m56443(c16461, c5690, 0) == -4) {
                    if (c5690.m33305()) {
                        this.f28004 = true;
                    } else {
                        c5690.m16713();
                        ByteBuffer byteBuffer = c5690.f19651;
                        byteBuffer.getClass();
                        long j4 = c5690.f19652;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.f28002.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(am.aF);
                        parcelableArrayList.getClass();
                        int i = AbstractC1928.f6477;
                        C22811 c22811 = new C22811();
                        for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i2);
                            bundle2.getClass();
                            c22811.m19807(C2137.m7380(bundle2));
                        }
                        C16187 c16187 = new C16187(j4, bundle.getLong("d"), c22811.m51441());
                        c5690.mo7();
                        zMo2165 = this.f27996.mo2165(c16187, j);
                    }
                }
            }
            long jMo2166 = this.f27996.mo2166(this.f28005);
            if (jMo2166 == Long.MIN_VALUE && this.f28004 && !zMo2165) {
                this.f27997 = true;
            }
            if (jMo2166 != Long.MIN_VALUE && jMo2166 <= j) {
                zMo2165 = true;
            }
            if (zMo2165) {
                AbstractC1928 abstractC1928Mo2164 = this.f27996.mo2164(j);
                long jMo2167 = this.f27996.mo2167(j);
                m23028(jMo2167);
                C11831 c11832 = new C11831(abstractC1928Mo2164);
                if (handler != null) {
                    handler.obtainMessage(1, c11832).sendToTarget();
                } else {
                    interfaceC2610.mo4878(c11832.f38157);
                    interfaceC2610.mo4879(c11832);
                }
                this.f27996.mo2168(jMo2167);
            }
            this.f28005 = j;
            return;
        }
        m23025();
        this.f28005 = j;
        AbstractC7984 abstractC7986 = this.f28003;
        InterfaceC9321 interfaceC9321 = this.f28008;
        if (abstractC7986 != null) {
            if (getState() != 2) {
                return;
            }
            if (this.f27995 != null) {
                jM23026 = m23026();
                z = false;
                while (jM23026 <= j) {
                    this.f28009++;
                    jM23026 = m23026();
                    z = true;
                }
            } else {
                z = false;
            }
            abstractC7984 = this.f28003;
            if (abstractC7984 != null) {
                if (abstractC7984.m33305()) {
                    if (!z) {
                        if (this.f27993 == 2) {
                            m23029();
                            InterfaceC4255 interfaceC4255 = this.f28001;
                            interfaceC4255.getClass();
                            interfaceC4255.mo12();
                            this.f28001 = null;
                            this.f27993 = 0;
                            this.f28006 = true;
                            C15648 c156410 = this.f28010;
                            c156410.getClass();
                            InterfaceC4255 interfaceC4255M4156 = ((C1119) interfaceC9321).m4156(c156410);
                            this.f28001 = interfaceC4255M4156;
                            interfaceC4255M4156.mo39839(m56453());
                        } else {
                            m23029();
                            this.f27997 = true;
                        }
                    }
                } else if (abstractC7984.f37777 <= j) {
                    abstractC7985 = this.f27995;
                    if (abstractC7985 != null) {
                        abstractC7985.mo8();
                    }
                    this.f28009 = abstractC7984.mo21768(j);
                    this.f27995 = abstractC7984;
                    this.f28003 = null;
                    z = true;
                }
            }
            if (z) {
                this.f27995.getClass();
                iMo21768 = this.f27995.mo21768(j);
                if (iMo21768 != 0) {
                    jMo21769 = this.f27995.f37777;
                } else {
                    jMo21769 = this.f27995.f37777;
                }
                m23028(jMo21769);
                c11831 = new C11831(this.f27995.mo21771(j));
                if (handler != null) {
                    handler.obtainMessage(1, c11831).sendToTarget();
                } else {
                    interfaceC2610.mo4878(c11831.f38157);
                    interfaceC2610.mo4879(c11831);
                }
            }
            if (this.f27993 == 2) {
                return;
            }
            while (!this.f28004) {
                c0526 = this.f27994;
                if (c0526 == null) {
                    InterfaceC4255 interfaceC4256 = this.f28001;
                    interfaceC4256.getClass();
                    c0526 = (C0526) interfaceC4256.mo39837();
                    if (c0526 == null) {
                        return;
                    } else {
                        this.f27994 = c0526;
                    }
                }
                if (this.f27993 == 1) {
                    c0526.m33307(4);
                    InterfaceC4255 interfaceC4257 = this.f28001;
                    interfaceC4257.getClass();
                    interfaceC4257.mo39834(c0526);
                    this.f27994 = null;
                    this.f27993 = 2;
                    return;
                }
                iM56443 = m56443(c16461, c0526, 0);
                if (iM56443 == -4) {
                    if (c0526.m33305()) {
                        this.f28004 = true;
                        this.f28006 = false;
                    } else {
                        c15648 = c16461.f53378;
                        if (c15648 == null) {
                            return;
                        }
                        c0526.f2225 = c15648.f50837;
                        c0526.m16713();
                        this.f28006 &= !c0526.m33304();
                    }
                    if (!this.f28006) {
                        InterfaceC4255 interfaceC4258 = this.f28001;
                        interfaceC4258.getClass();
                        interfaceC4258.mo39834(c0526);
                        this.f27994 = null;
                    }
                } else if (iM56443 == -3) {
                    return;
                }
            }
            return;
        }
        InterfaceC4255 interfaceC4259 = this.f28001;
        interfaceC4259.getClass();
        interfaceC4259.mo13583(j);
        try {
            InterfaceC4255 interfaceC42510 = this.f28001;
            interfaceC42510.getClass();
            this.f28003 = (AbstractC7984) interfaceC42510.mo28187();
            if (getState() != 2) {
                return;
            }
            if (this.f27995 != null) {
                jM23026 = m23026();
                z = false;
                while (jM23026 <= j) {
                    this.f28009++;
                    jM23026 = m23026();
                    z = true;
                }
            } else {
                z = false;
            }
            abstractC7984 = this.f28003;
            if (abstractC7984 != null) {
                if (abstractC7984.m33305()) {
                    if (!z && m23026() == C25227.FOREVER_NS) {
                        if (this.f27993 == 2) {
                            m23029();
                            InterfaceC4255 interfaceC42511 = this.f28001;
                            interfaceC42511.getClass();
                            interfaceC42511.mo12();
                            this.f28001 = null;
                            this.f27993 = 0;
                            this.f28006 = true;
                            C15648 c156411 = this.f28010;
                            c156411.getClass();
                            InterfaceC4255 interfaceC4255M4157 = ((C1119) interfaceC9321).m4156(c156411);
                            this.f28001 = interfaceC4255M4157;
                            interfaceC4255M4157.mo39839(m56453());
                        } else {
                            m23029();
                            this.f27997 = true;
                        }
                    }
                } else if (abstractC7984.f37777 <= j) {
                    abstractC7985 = this.f27995;
                    if (abstractC7985 != null) {
                        abstractC7985.mo8();
                    }
                    this.f28009 = abstractC7984.mo21768(j);
                    this.f27995 = abstractC7984;
                    this.f28003 = null;
                    z = true;
                }
            }
            if (z) {
                this.f27995.getClass();
                iMo21768 = this.f27995.mo21768(j);
                if (iMo21768 != 0 || this.f27995.mo21767() == 0) {
                    jMo21769 = this.f27995.f37777;
                } else if (iMo21768 == -1) {
                    AbstractC7984 abstractC7987 = this.f27995;
                    jMo21769 = abstractC7987.mo21769(abstractC7987.mo21767() - 1);
                } else {
                    jMo21769 = this.f27995.mo21769(iMo21768 - 1);
                }
                m23028(jMo21769);
                c11831 = new C11831(this.f27995.mo21771(j));
                if (handler != null) {
                    handler.obtainMessage(1, c11831).sendToTarget();
                } else {
                    interfaceC2610.mo4878(c11831.f38157);
                    interfaceC2610.mo4879(c11831);
                }
            }
            if (this.f27993 == 2) {
                return;
            }
            while (!this.f28004) {
                try {
                    c0526 = this.f27994;
                    if (c0526 == null) {
                        InterfaceC4255 interfaceC42512 = this.f28001;
                        interfaceC42512.getClass();
                        c0526 = (C0526) interfaceC42512.mo39837();
                        if (c0526 == null) {
                            return;
                        } else {
                            this.f27994 = c0526;
                        }
                    }
                    if (this.f27993 == 1) {
                        c0526.m33307(4);
                        InterfaceC4255 interfaceC42513 = this.f28001;
                        interfaceC42513.getClass();
                        interfaceC42513.mo39834(c0526);
                        this.f27994 = null;
                        this.f27993 = 2;
                        return;
                    }
                    iM56443 = m56443(c16461, c0526, 0);
                    if (iM56443 == -4) {
                        if (c0526.m33305()) {
                            this.f28004 = true;
                            this.f28006 = false;
                        } else {
                            c15648 = c16461.f53378;
                            if (c15648 == null) {
                                return;
                            }
                            c0526.f2225 = c15648.f50837;
                            c0526.m16713();
                            this.f28006 &= !c0526.m33304();
                        }
                        if (!this.f28006) {
                            InterfaceC4255 interfaceC42514 = this.f28001;
                            interfaceC42514.getClass();
                            interfaceC42514.mo39834(c0526);
                            this.f27994 = null;
                        }
                    } else if (iM56443 == -3) {
                        return;
                    }
                } catch (C14695 e) {
                    e = e;
                    sb = new StringBuilder("Subtitle decoding failed. streamFormat=");
                }
            }
            return;
        } catch (C14695 e2) {
            e = e2;
            sb = new StringBuilder("Subtitle decoding failed. streamFormat=");
        }
        sb.append(this.f28010);
        C1896.m6516(sb.toString(), e);
        m23027();
        m23029();
        InterfaceC4255 interfaceC42515 = this.f28001;
        interfaceC42515.getClass();
        interfaceC42515.mo12();
        this.f28001 = null;
        this.f27993 = 0;
        this.f28006 = true;
        C15648 c156412 = this.f28010;
        c156412.getClass();
        InterfaceC4255 interfaceC4255M4158 = ((C1119) interfaceC9321).m4156(c156412);
        this.f28001 = interfaceC4255M4158;
        interfaceC4255M4158.mo39839(m56453());
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ֨ */
    public final void mo11184() {
        this.f28010 = null;
        this.f27998 = -9223372036854775807L;
        m23027();
        this.f28005 = -9223372036854775807L;
        if (this.f28001 != null) {
            m23029();
            InterfaceC4255 interfaceC4255 = this.f28001;
            interfaceC4255.getClass();
            interfaceC4255.mo12();
            this.f28001 = null;
            this.f27993 = 0;
        }
    }

    @Override // l.AbstractC25280, l.InterfaceC4002
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo11190() {
        return this.f27997;
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo11189() {
        C15648 c15648 = this.f28010;
        if (c15648 != null) {
            if (C17359.equals(c15648.f50848, "application/x-media3-cues")) {
                InterfaceC0373 interfaceC0373 = this.f27996;
                interfaceC0373.getClass();
                if (interfaceC0373.mo2166(this.f28005) == Long.MIN_VALUE) {
                    try {
                        mo12956();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (!this.f27997) {
                    if (this.f28004) {
                        AbstractC7984 abstractC7984 = this.f27995;
                        long j = this.f28005;
                        if (abstractC7984 == null || abstractC7984.mo21767() <= 0 || abstractC7984.mo21769(abstractC7984.mo21767() - 1) <= j) {
                            AbstractC7984 abstractC7985 = this.f28003;
                            long j2 = this.f28005;
                            if ((abstractC7985 == null || abstractC7985.mo21767() <= 0 || abstractC7985.mo21769(abstractC7985.mo21767() - 1) <= j2) && this.f27994 != null) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    private void m23029() {
        this.f27994 = null;
        this.f28009 = -1;
        AbstractC7984 abstractC7984 = this.f27995;
        if (abstractC7984 != null) {
            abstractC7984.mo8();
            this.f27995 = null;
        }
        AbstractC7984 abstractC7985 = this.f28003;
        if (abstractC7985 != null) {
            abstractC7985.mo8();
            this.f28003 = null;
        }
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    private long m23026() {
        if (this.f28009 == -1) {
            return C25227.FOREVER_NS;
        }
        this.f27995.getClass();
        return this.f28009 >= this.f27995.mo21767() ? C25227.FOREVER_NS : this.f27995.mo21769(this.f28009);
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    private void m23027() {
        AbstractC1928 abstractC1928Of = AbstractC1928.of();
        m23028(this.f28005);
        C11831 c11831 = new C11831(abstractC1928Of);
        Handler handler = this.f27999;
        if (handler != null) {
            handler.obtainMessage(1, c11831).sendToTarget();
            return;
        }
        AbstractC1928 abstractC1928 = c11831.f38157;
        InterfaceC2610 interfaceC2610 = this.f28007;
        interfaceC2610.mo4878(abstractC1928);
        interfaceC2610.mo4879(c11831);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            C11831 c11831 = (C11831) message.obj;
            AbstractC1928 abstractC1928 = c11831.f38157;
            InterfaceC2610 interfaceC2610 = this.f28007;
            interfaceC2610.mo4878(abstractC1928);
            interfaceC2610.mo4879(c11831);
            return true;
        }
        throw new IllegalStateException();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private long m23028(long j) {
        C20782.m47568(j != -9223372036854775807L);
        return j - m56448();
    }

    @RequiresNonNull({"streamFormat"})
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    private void m23025() {
        C20782.m47567("Legacy decoding is disabled, can't handle " + this.f28010.f50848 + " samples (expected application/x-media3-cues).", C17359.equals(this.f28010.f50848, "application/cea-608") || C17359.equals(this.f28010.f50848, "application/x-mp4-cea-608") || C17359.equals(this.f28010.f50848, "application/cea-708"));
    }

    @Override // l.InterfaceC18172
    /* JADX INFO: renamed from: ۙ */
    public final int mo11185(C15648 c15648) {
        if (C17359.equals(c15648.f50848, "application/x-media3-cues") || ((C1119) this.f28008).m4157(c15648)) {
            return C14442.m34863(c15648.f50813 == 0 ? 4 : 2, 0, 0, 0);
        }
        return C9681.m25250(c15648.f50848) ? C14442.m34863(1, 0, 0, 0) : C14442.m34863(0, 0, 0, 0);
    }
}
