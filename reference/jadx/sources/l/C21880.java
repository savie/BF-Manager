package l;

import android.graphics.Bitmap;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.᩷ۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08T5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C21880 extends AbstractC25280 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public C4726 f69714;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final C18939 f69715;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public boolean f69716;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f69717;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C9988 f69718;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public C4726 f69719;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f69720;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public long f69721;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f69722;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C13717 f69723;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f69724;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public C5690 f69725;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final C5690 f69726;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC8497 f69727;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public boolean f69728;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public long f69729;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f69730;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C15648 f69731;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public Bitmap f69732;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f69733;

    @Override // l.InterfaceC4002, l.InterfaceC18172
    public final String getName() {
        return "ImageRenderer";
    }

    public C21880(C18939 c18939) {
        super(4);
        this.f69715 = c18939;
        this.f69727 = InterfaceC8497.f27794;
        this.f69726 = new C5690(0, 0);
        this.f69723 = C13717.f43541;
        this.f69730 = new ArrayDeque();
        this.f69729 = -9223372036854775807L;
        this.f69721 = -9223372036854775807L;
        this.f69720 = 0;
        this.f69733 = 1;
    }

    @Override // l.InterfaceC18172
    /* JADX INFO: renamed from: ۙ */
    public final int mo11185(C15648 c15648) {
        return this.f69715.m43961(c15648);
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ۙ */
    public final void mo11186(long j, long j2) throws C18566 {
        if (this.f69717) {
            return;
        }
        if (this.f69731 == null) {
            C16461 c16461M56450 = m56450();
            C5690 c5690 = this.f69726;
            c5690.mo7();
            int iM56443 = m56443(c16461M56450, c5690, 2);
            if (iM56443 != -5) {
                if (iM56443 == -4) {
                    C20782.m47568(c5690.m33305());
                    this.f69716 = true;
                    this.f69717 = true;
                    return;
                }
                return;
            }
            C15648 c15648 = c16461M56450.f53378;
            C20782.m47566(c15648);
            this.f69731 = c15648;
            this.f69724 = true;
        }
        if (this.f69718 == null) {
            m49569();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (m49570(j)) {
            }
            while (m49572(j)) {
            }
            Trace.endSection();
        } catch (C9242 e) {
            throw m56444(e, (C15648) null, 4003);
        }
    }

    @Override // l.InterfaceC4002
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo11189() {
        int i = this.f69733;
        if (i != 3) {
            return i == 0 && this.f69728;
        }
        return true;
    }

    @Override // l.AbstractC25280, l.InterfaceC4002
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo11190() {
        return this.f69717;
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۙ */
    public final void mo22678(boolean z, boolean z2) {
        this.f69733 = z2 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo11188(l.C15648[] r5, long r6, long r8, l.C8402 r10) {
        /*
            r4 = this;
            l.۬۠ۙ r5 = r4.f69723
            long r5 = r5.f43543
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L31
            java.util.ArrayDeque r5 = r4.f69730
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.f69729
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.f69721
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 < 0) goto L26
            goto L31
        L26:
            l.۬۠ۙ r6 = new l.۬۠ۙ
            long r0 = r4.f69729
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            l.۬۠ۙ r5 = new l.۬۠ۙ
            r5.<init>(r0, r8)
            r4.f69723 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21880.mo11188(l.ܳ᩹ۙ[], long, long, l.۠ۙ᩷):void");
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ֨ */
    public final void mo11184() {
        this.f69731 = null;
        this.f69723 = C13717.f43541;
        this.f69730.clear();
        m49571();
        this.f69727.mo8440();
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۠ */
    public final void mo22684() {
        m49571();
        this.f69733 = Math.min(this.f69733, 1);
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۡ */
    public final void mo48644() {
        m49571();
    }

    @Override // l.AbstractC25280, l.InterfaceC3256
    /* JADX INFO: renamed from: ۙ */
    public final void mo10630(int i, Object obj) {
        if (i != 15) {
            return;
        }
        InterfaceC8497 interfaceC8497 = obj instanceof InterfaceC8497 ? (InterfaceC8497) obj : null;
        if (interfaceC8497 == null) {
            interfaceC8497 = InterfaceC8497.f27794;
        }
        this.f69727 = interfaceC8497;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:70:0x0109  */
    /* JADX WARN: Code duplicated, block: B:73:0x0117  */
    /* JADX WARN: Code duplicated, block: B:81:0x0142  */
    /* JADX WARN: Code duplicated, block: B:83:0x015e  */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m49570(long j) throws C18566 {
        boolean z;
        Bitmap bitmapM14624;
        long jM14621;
        boolean z2;
        int i;
        boolean z3;
        int iM14623;
        int i2;
        C15648 c15648;
        C4726 c4726;
        Bitmap bitmapCreateBitmap;
        if ((this.f69732 == null || this.f69714 != null) && (this.f69733 != 0 || getState() == 2)) {
            Bitmap bitmap = this.f69732;
            ArrayDeque arrayDeque = this.f69730;
            if (bitmap == null) {
                C20782.m47566(this.f69718);
                AbstractC7006 abstractC7006 = (AbstractC7006) this.f69718.mo28187();
                if (abstractC7006 != null) {
                    if (abstractC7006.m33305()) {
                        if (this.f69720 == 3) {
                            m49571();
                            C20782.m47566(this.f69731);
                            m49569();
                            return false;
                        }
                        abstractC7006.mo8();
                        if (arrayDeque.isEmpty()) {
                            this.f69717 = true;
                            return false;
                        }
                    } else {
                        Bitmap bitmap2 = abstractC7006.f23098;
                        if (bitmap2 == null) {
                            throw new IllegalStateException("Non-EOS buffer came back from the decoder without bitmap.");
                        }
                        this.f69732 = bitmap2;
                        abstractC7006.mo8();
                        if (this.f69728 && this.f69732 != null && this.f69714 != null) {
                            C20782.m47566(this.f69731);
                            C15648 c15649 = this.f69731;
                            int i3 = c15649.f50833;
                            int i4 = c15649.f50821;
                            z = ((i3 != 1 && i4 == 1) || i3 == -1 || i4 == -1) ? false : true;
                            if (!this.f69714.m14625()) {
                                c4726 = this.f69714;
                                if (z) {
                                    int iM14624 = c4726.m14623();
                                    C20782.m47566(this.f69732);
                                    int width = this.f69732.getWidth();
                                    C15648 c156410 = this.f69731;
                                    C20782.m47566(c156410);
                                    int i5 = width / c156410.f50833;
                                    int height = this.f69732.getHeight();
                                    C15648 c156411 = this.f69731;
                                    C20782.m47566(c156411);
                                    int i6 = height / c156411.f50821;
                                    int i7 = this.f69731.f50833;
                                    bitmapCreateBitmap = Bitmap.createBitmap(this.f69732, (iM14624 % i7) * i5, (iM14624 / i7) * i6, i5, i6);
                                } else {
                                    bitmapCreateBitmap = this.f69732;
                                    C20782.m47566(bitmapCreateBitmap);
                                }
                                c4726.m14622(bitmapCreateBitmap);
                            }
                            bitmapM14624 = this.f69714.m14624();
                            C20782.m47566(bitmapM14624);
                            jM14621 = this.f69714.m14621();
                            long j2 = jM14621 - j;
                            if (getState() == 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            i = this.f69733;
                            if (i != 0) {
                                if (i != 1) {
                                    z2 = true;
                                } else {
                                    if (i == 3) {
                                        throw new IllegalStateException();
                                    }
                                    z2 = false;
                                }
                            }
                            if (!z2 || j2 < 30000) {
                                this.f69727.mo8441(jM14621 - this.f69723.f43543, bitmapM14624);
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                C4726 c4727 = this.f69714;
                                C20782.m47566(c4727);
                                long jM14622 = c4727.m14621();
                                this.f69721 = jM14622;
                                while (!arrayDeque.isEmpty() && jM14622 >= ((C13717) arrayDeque.peek()).f43542) {
                                    this.f69723 = (C13717) arrayDeque.removeFirst();
                                }
                                this.f69733 = 3;
                                if (z) {
                                    C4726 c4728 = this.f69714;
                                    C20782.m47566(c4728);
                                    iM14623 = c4728.m14623();
                                    C15648 c156412 = this.f69731;
                                    C20782.m47566(c156412);
                                    i2 = c156412.f50821;
                                    c15648 = this.f69731;
                                    C20782.m47566(c15648);
                                    if (iM14623 == (i2 * c15648.f50833) - 1) {
                                        this.f69732 = null;
                                    }
                                } else {
                                    this.f69732 = null;
                                }
                                this.f69714 = this.f69719;
                                this.f69719 = null;
                                return true;
                            }
                        }
                    }
                }
            } else if (this.f69728) {
                C20782.m47566(this.f69731);
                C15648 c156413 = this.f69731;
                int i8 = c156413.f50833;
                int i9 = c156413.f50821;
                if (i8 != 1) {
                }
                if (!this.f69714.m14625()) {
                    c4726 = this.f69714;
                    if (z) {
                        int iM14625 = c4726.m14623();
                        C20782.m47566(this.f69732);
                        int width2 = this.f69732.getWidth();
                        C15648 c156414 = this.f69731;
                        C20782.m47566(c156414);
                        int i10 = width2 / c156414.f50833;
                        int height2 = this.f69732.getHeight();
                        C15648 c156415 = this.f69731;
                        C20782.m47566(c156415);
                        int i11 = height2 / c156415.f50821;
                        int i12 = this.f69731.f50833;
                        bitmapCreateBitmap = Bitmap.createBitmap(this.f69732, (iM14625 % i12) * i10, (iM14625 / i12) * i11, i10, i11);
                    } else {
                        bitmapCreateBitmap = this.f69732;
                        C20782.m47566(bitmapCreateBitmap);
                    }
                    c4726.m14622(bitmapCreateBitmap);
                }
                bitmapM14624 = this.f69714.m14624();
                C20782.m47566(bitmapM14624);
                jM14621 = this.f69714.m14621();
                long j3 = jM14621 - j;
                if (getState() == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i = this.f69733;
                if (i != 0) {
                    if (i != 1) {
                        z2 = true;
                    } else {
                        if (i == 3) {
                            throw new IllegalStateException();
                        }
                        z2 = false;
                    }
                }
                if (z2) {
                    this.f69727.mo8441(jM14621 - this.f69723.f43543, bitmapM14624);
                    z3 = true;
                } else {
                    this.f69727.mo8441(jM14621 - this.f69723.f43543, bitmapM14624);
                    z3 = true;
                }
                if (z3) {
                    C4726 c4729 = this.f69714;
                    C20782.m47566(c4729);
                    long jM14623 = c4729.m14621();
                    this.f69721 = jM14623;
                    while (!arrayDeque.isEmpty()) {
                        this.f69723 = (C13717) arrayDeque.removeFirst();
                    }
                    this.f69733 = 3;
                    if (z) {
                        C4726 c47210 = this.f69714;
                        C20782.m47566(c47210);
                        iM14623 = c47210.m14623();
                        C15648 c156416 = this.f69731;
                        C20782.m47566(c156416);
                        i2 = c156416.f50821;
                        c15648 = this.f69731;
                        C20782.m47566(c15648);
                        if (iM14623 == (i2 * c15648.f50833) - 1) {
                            this.f69732 = null;
                        }
                    } else {
                        this.f69732 = null;
                    }
                    this.f69714 = this.f69719;
                    this.f69719 = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:69:0x0113  */
    /* JADX WARN: Code duplicated, block: B:75:0x011d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0125  */
    /* JADX WARN: Code duplicated, block: B:83:0x0136  */
    /* JADX WARN: Code duplicated, block: B:85:0x013b  */
    /* JADX WARN: Code duplicated, block: B:87:0x014c  */
    /* JADX WARN: Code duplicated, block: B:88:0x014f  */
    /* JADX WARN: Code duplicated, block: B:91:0x015b  */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m49572(long j) {
        int iM56443;
        ByteBuffer byteBuffer;
        C5690 c5690;
        boolean z;
        C5690 c5691;
        C4726 c4726;
        long jM14621;
        boolean z2;
        C4726 c4727;
        boolean z3;
        C15648 c15648;
        boolean z4;
        boolean z5;
        C5690 c5692;
        if (!this.f69728 || this.f69714 == null) {
            C16461 c16461M56450 = m56450();
            C9988 c9988 = this.f69718;
            if (c9988 != null && this.f69720 != 3 && !this.f69716) {
                if (this.f69725 == null) {
                    C5690 c5693 = (C5690) c9988.mo39837();
                    this.f69725 = c5693;
                    if (c5693 != null) {
                        if (this.f69720 == 2) {
                            C20782.m47566(this.f69725);
                            this.f69725.m33307(4);
                            C9988 c9989 = this.f69718;
                            C20782.m47566(c9989);
                            c9989.m3945(this.f69725);
                            this.f69725 = null;
                            this.f69720 = 3;
                            return false;
                        }
                        iM56443 = m56443(c16461M56450, this.f69725, 0);
                        if (iM56443 != -5) {
                            C15648 c15649 = c16461M56450.f53378;
                            C20782.m47566(c15649);
                            this.f69731 = c15649;
                            this.f69724 = true;
                            this.f69720 = 2;
                            return true;
                        }
                        if (iM56443 != -4) {
                            this.f69725.m16713();
                            byteBuffer = this.f69725.f19651;
                            if (byteBuffer != null || byteBuffer.remaining() <= 0) {
                                c5690 = this.f69725;
                                C20782.m47566(c5690);
                                if (c5690.m33305()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                C5690 c5694 = this.f69725;
                                C20782.m47566(c5694);
                                c5694.f19653 = this.f69731;
                                C9988 c99810 = this.f69718;
                                C20782.m47566(c99810);
                                C5690 c5695 = this.f69725;
                                C20782.m47566(c5695);
                                c99810.m3945(c5695);
                                this.f69722 = 0;
                            }
                            c5691 = this.f69725;
                            C20782.m47566(c5691);
                            if (c5691.m33305()) {
                                this.f69728 = true;
                            } else {
                                int i = this.f69722;
                                c4726 = new C4726(i, c5691.f19652);
                                this.f69719 = c4726;
                                this.f69722 = i + 1;
                                if (!this.f69728) {
                                    jM14621 = c4726.m14621();
                                    if (jM14621 - 30000 <= j || j > 30000 + jM14621) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    c4727 = this.f69714;
                                    if (c4727 != null || c4727.m14621() > j || j >= jM14621) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    C4726 c4728 = this.f69719;
                                    C20782.m47566(c4728);
                                    c15648 = this.f69731;
                                    C20782.m47566(c15648);
                                    if (c15648.f50833 != -1 || this.f69731.f50821 == -1) {
                                        z4 = true;
                                    } else {
                                        int iM14623 = c4728.m14623();
                                        C15648 c156410 = this.f69731;
                                        C20782.m47566(c156410);
                                        if (iM14623 == (c156410.f50821 * this.f69731.f50833) - 1) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                    }
                                    if (!z2 || z3 || z4) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    this.f69728 = z5;
                                    if (z3 || z2) {
                                        this.f69714 = this.f69719;
                                        this.f69719 = null;
                                    }
                                } else {
                                    this.f69714 = this.f69719;
                                    this.f69719 = null;
                                }
                            }
                            c5692 = this.f69725;
                            C20782.m47566(c5692);
                            if (c5692.m33305()) {
                                this.f69716 = true;
                                this.f69725 = null;
                                return false;
                            }
                            long j2 = this.f69729;
                            C5690 c5696 = this.f69725;
                            C20782.m47566(c5696);
                            this.f69729 = Math.max(j2, c5696.f19652);
                            if (z) {
                                this.f69725 = null;
                            } else {
                                C5690 c5697 = this.f69725;
                                C20782.m47566(c5697);
                                c5697.mo7();
                            }
                            return !this.f69728;
                        }
                        if (iM56443 != -3) {
                            throw new IllegalStateException();
                        }
                    }
                } else {
                    if (this.f69720 == 2) {
                        C20782.m47566(this.f69725);
                        this.f69725.m33307(4);
                        C9988 c99811 = this.f69718;
                        C20782.m47566(c99811);
                        c99811.m3945(this.f69725);
                        this.f69725 = null;
                        this.f69720 = 3;
                        return false;
                    }
                    iM56443 = m56443(c16461M56450, this.f69725, 0);
                    if (iM56443 != -5) {
                        C15648 c156411 = c16461M56450.f53378;
                        C20782.m47566(c156411);
                        this.f69731 = c156411;
                        this.f69724 = true;
                        this.f69720 = 2;
                        return true;
                    }
                    if (iM56443 != -4) {
                        this.f69725.m16713();
                        byteBuffer = this.f69725.f19651;
                        if (byteBuffer != null) {
                            c5690 = this.f69725;
                            C20782.m47566(c5690);
                            if (c5690.m33305()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            c5690 = this.f69725;
                            C20782.m47566(c5690);
                            if (c5690.m33305()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            C5690 c5698 = this.f69725;
                            C20782.m47566(c5698);
                            c5698.f19653 = this.f69731;
                            C9988 c99812 = this.f69718;
                            C20782.m47566(c99812);
                            C5690 c5699 = this.f69725;
                            C20782.m47566(c5699);
                            c99812.m3945(c5699);
                            this.f69722 = 0;
                        }
                        c5691 = this.f69725;
                        C20782.m47566(c5691);
                        if (c5691.m33305()) {
                            this.f69728 = true;
                        } else {
                            int i2 = this.f69722;
                            c4726 = new C4726(i2, c5691.f19652);
                            this.f69719 = c4726;
                            this.f69722 = i2 + 1;
                            if (!this.f69728) {
                                jM14621 = c4726.m14621();
                                if (jM14621 - 30000 <= j) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                c4727 = this.f69714;
                                if (c4727 != null) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                C4726 c4729 = this.f69719;
                                C20782.m47566(c4729);
                                c15648 = this.f69731;
                                C20782.m47566(c15648);
                                if (c15648.f50833 != -1) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (z2) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                this.f69728 = z5;
                                if (z3) {
                                    this.f69714 = this.f69719;
                                    this.f69719 = null;
                                } else {
                                    this.f69714 = this.f69719;
                                    this.f69719 = null;
                                }
                            } else {
                                this.f69714 = this.f69719;
                                this.f69719 = null;
                            }
                        }
                        c5692 = this.f69725;
                        C20782.m47566(c5692);
                        if (c5692.m33305()) {
                            this.f69716 = true;
                            this.f69725 = null;
                            return false;
                        }
                        long j3 = this.f69729;
                        C5690 c56910 = this.f69725;
                        C20782.m47566(c56910);
                        this.f69729 = Math.max(j3, c56910.f19652);
                        if (z) {
                            this.f69725 = null;
                        } else {
                            C5690 c56911 = this.f69725;
                            C20782.m47566(c56911);
                            c56911.mo7();
                        }
                        return !this.f69728;
                    }
                    if (iM56443 != -3) {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    private void m49569() throws C18566 {
        if (this.f69724) {
            C15648 c15648 = this.f69731;
            c15648.getClass();
            C18939 c18939 = this.f69715;
            int iM43961 = c18939.m43961(c15648);
            if (iM43961 == C14442.m34863(4, 0, 0, 0) || iM43961 == C14442.m34863(3, 0, 0, 0)) {
                C9988 c9988 = this.f69718;
                if (c9988 != null) {
                    c9988.mo12();
                }
                this.f69718 = c18939.m43962();
                this.f69724 = false;
                return;
            }
            throw m56444(new C9242("Provided decoder factory can't create decoder for format."), this.f69731, 4005);
        }
    }

    @Override // l.AbstractC25280
    /* JADX INFO: renamed from: ۙ */
    public final void mo11187(long j, boolean z) {
        this.f69733 = Math.min(this.f69733, 1);
        this.f69717 = false;
        this.f69716 = false;
        this.f69732 = null;
        this.f69714 = null;
        this.f69719 = null;
        this.f69728 = false;
        this.f69725 = null;
        C9988 c9988 = this.f69718;
        if (c9988 != null) {
            c9988.flush();
        }
        this.f69730.clear();
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    private void m49571() {
        this.f69725 = null;
        this.f69720 = 0;
        this.f69729 = -9223372036854775807L;
        C9988 c9988 = this.f69718;
        if (c9988 != null) {
            c9988.mo12();
            this.f69718 = null;
        }
    }
}
