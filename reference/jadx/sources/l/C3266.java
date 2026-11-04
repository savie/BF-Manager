package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3266 extends AbstractC11272 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11490 f10612;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f10613 = 0;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final C3266 f10614;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f10615;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public volatile Object f10616;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public volatile Object f10617;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f10618;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f10619;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f10620;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile Object f10621;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public volatile Object f10622;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f10623;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f10624;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C16471 f10625;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public volatile Object f10626;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public volatile Object f10627;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public volatile Object f10628;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile Object f10629;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public volatile Object f10630;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f10631;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f10632;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public volatile Object f10633;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f10634;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public byte f10635;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f10636;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public List f10637;

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        C1578 c1578 = new C1578(this);
        if ((this.f10634 & 1) != 0) {
            AbstractC9035.m24111(abstractC14846, 1, this.f10629);
        }
        if ((this.f10634 & 2) != 0) {
            AbstractC9035.m24111(abstractC14846, 8, this.f10621);
        }
        if ((this.f10634 & 32) != 0) {
            abstractC14846.mo14022(9, this.f10636);
        }
        if ((this.f10634 & 4) != 0) {
            abstractC14846.mo14010(10, this.f10623);
        }
        if ((this.f10634 & 64) != 0) {
            AbstractC9035.m24111(abstractC14846, 11, this.f10616);
        }
        if ((this.f10634 & 128) != 0) {
            abstractC14846.mo14010(16, this.f10615);
        }
        if ((this.f10634 & 256) != 0) {
            abstractC14846.mo14010(17, this.f10618);
        }
        if ((this.f10634 & 512) != 0) {
            abstractC14846.mo14010(18, this.f10620);
        }
        if ((this.f10634 & 8) != 0) {
            abstractC14846.mo14010(20, this.f10624);
        }
        if ((this.f10634 & 1024) != 0) {
            abstractC14846.mo14010(23, this.f10632);
        }
        if ((this.f10634 & 16) != 0) {
            abstractC14846.mo14010(27, this.f10619);
        }
        if ((this.f10634 & 2048) != 0) {
            abstractC14846.mo14010(31, this.f10631);
        }
        if ((this.f10634 & 4096) != 0) {
            AbstractC9035.m24111(abstractC14846, 36, this.f10626);
        }
        if ((this.f10634 & 8192) != 0) {
            AbstractC9035.m24111(abstractC14846, 37, this.f10622);
        }
        if ((this.f10634 & 16384) != 0) {
            AbstractC9035.m24111(abstractC14846, 39, this.f10627);
        }
        if ((this.f10634 & 32768) != 0) {
            AbstractC9035.m24111(abstractC14846, 40, this.f10633);
        }
        if ((this.f10634 & 65536) != 0) {
            AbstractC9035.m24111(abstractC14846, 41, this.f10628);
        }
        if ((this.f10634 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            AbstractC9035.m24111(abstractC14846, 44, this.f10630);
        }
        if ((this.f10634 & 262144) != 0) {
            AbstractC9035.m24111(abstractC14846, 45, this.f10617);
        }
        if ((this.f10634 & 524288) != 0) {
            abstractC14846.mo14025(50, m10737());
        }
        for (int i = 0; i < this.f10637.size(); i++) {
            abstractC14846.mo14025(EnumC5810.f19979, (InterfaceC18775) this.f10637.get(i));
        }
        c1578.m5597(536870912, abstractC14846);
        getUnknownFields().writeTo(abstractC14846);
    }

    static {
        C0304.m1888(EnumC18203.PUBLIC, C3266.class.getName());
        f10614 = new C3266();
        f10612 = new C16690();
    }

    public C3266(C17436 c17436) {
        super(c17436);
        this.f10629 = "";
        this.f10621 = "";
        this.f10623 = false;
        this.f10624 = false;
        this.f10619 = false;
        this.f10636 = 1;
        this.f10616 = "";
        this.f10615 = false;
        this.f10618 = false;
        this.f10620 = false;
        this.f10632 = false;
        this.f10631 = true;
        this.f10626 = "";
        this.f10622 = "";
        this.f10627 = "";
        this.f10633 = "";
        this.f10628 = "";
        this.f10630 = "";
        this.f10617 = "";
        this.f10635 = (byte) -1;
    }

    public C3266() {
        this.f10629 = "";
        this.f10621 = "";
        this.f10623 = false;
        this.f10624 = false;
        this.f10619 = false;
        this.f10636 = 1;
        this.f10616 = "";
        this.f10615 = false;
        this.f10618 = false;
        this.f10620 = false;
        this.f10632 = false;
        this.f10631 = true;
        this.f10626 = "";
        this.f10622 = "";
        this.f10627 = "";
        this.f10633 = "";
        this.f10628 = "";
        this.f10630 = "";
        this.f10617 = "";
        this.f10635 = (byte) -1;
        this.f10629 = "";
        this.f10621 = "";
        this.f10636 = 1;
        this.f10616 = "";
        this.f10631 = true;
        this.f10626 = "";
        this.f10622 = "";
        this.f10627 = "";
        this.f10633 = "";
        this.f10628 = "";
        this.f10630 = "";
        this.f10617 = "";
        this.f10637 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC9035
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40282;
        c7544.m20621(C3266.class, C17436.class);
        return c7544;
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10720() {
        return (this.f10634 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m10708() {
        Object obj = this.f10629;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f10629 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10723() {
        return (this.f10634 & 2) != 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m10739() {
        Object obj = this.f10621;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f10621 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10732() {
        return (this.f10634 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m10711() {
        return this.f10623;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10717() {
        return (this.f10634 & 8) != 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m10733() {
        return this.f10624;
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10710() {
        return (this.f10634 & 16) != 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m10722() {
        return this.f10619;
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10718() {
        return (this.f10634 & 32) != 0;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC23404 m10730() {
        EnumC23404 enumC23404M52588 = EnumC23404.m52588(this.f10636);
        return enumC23404M52588 == null ? EnumC23404.SPEED : enumC23404M52588;
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10735() {
        return (this.f10634 & 64) != 0;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String m10706() {
        Object obj = this.f10616;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f10616 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m10714() {
        return (this.f10634 & 128) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m10726() {
        return this.f10615;
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10736() {
        return (this.f10634 & 256) != 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m10719() {
        return this.f10618;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10725() {
        return (this.f10634 & 512) != 0;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m10716() {
        return this.f10620;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m10721() {
        return (this.f10634 & 1024) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m10724() {
        return this.f10632;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m10705() {
        return (this.f10634 & 2048) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m10740() {
        return this.f10631;
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10704() {
        return (this.f10634 & 4096) != 0;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String m10734() {
        Object obj = this.f10626;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f10626 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m10712() {
        return (this.f10634 & 8192) != 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m10728() {
        Object obj = this.f10622;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f10622 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10707() {
        return (this.f10634 & 16384) != 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m10715() {
        Object obj = this.f10627;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f10627 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10741() {
        return (this.f10634 & 32768) != 0;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String m10702() {
        Object obj = this.f10633;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f10633 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10729() {
        return (this.f10634 & 65536) != 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m10731() {
        Object obj = this.f10628;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f10628 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10727() {
        return (this.f10634 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String m10713() {
        Object obj = this.f10630;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f10630 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10738() {
        return (this.f10634 & 262144) != 0;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m10703() {
        Object obj = this.f10617;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.f10617 = strM40221;
        }
        return strM40221;
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10709() {
        return (this.f10634 & 524288) != 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C16471 m10737() {
        C16471 c16471 = this.f10625;
        return c16471 == null ? C16471.getDefaultInstance() : c16471;
    }

    @Override // l.AbstractC11272, l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.f10635;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m10709() || m10737().isInitialized()) {
            for (int i = 0; i < this.f10637.size(); i++) {
                if (!((C20748) this.f10637.get(i)).isInitialized()) {
                    this.f10635 = (byte) 0;
                    return false;
                }
            }
            if (!m28524()) {
                this.f10635 = (byte) 0;
                return false;
            }
            this.f10635 = (byte) 1;
            return true;
        }
        this.f10635 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM24096 = (this.f10634 & 1) != 0 ? AbstractC9035.m24096(1, this.f10629) : 0;
        if ((this.f10634 & 2) != 0) {
            iM24096 += AbstractC9035.m24096(8, this.f10621);
        }
        if ((this.f10634 & 32) != 0) {
            iM24096 += AbstractC14846.m35768(9, this.f10636);
        }
        if ((this.f10634 & 4) != 0) {
            iM24096 += AbstractC14846.m35772(10);
        }
        if ((this.f10634 & 64) != 0) {
            iM24096 += AbstractC9035.m24096(11, this.f10616);
        }
        if ((this.f10634 & 128) != 0) {
            iM24096 += AbstractC14846.m35772(16);
        }
        if ((this.f10634 & 256) != 0) {
            iM24096 += AbstractC14846.m35772(17);
        }
        if ((this.f10634 & 512) != 0) {
            iM24096 += AbstractC14846.m35772(18);
        }
        if ((this.f10634 & 8) != 0) {
            iM24096 += AbstractC14846.m35772(20);
        }
        if ((this.f10634 & 1024) != 0) {
            iM24096 += AbstractC14846.m35772(23);
        }
        if ((this.f10634 & 16) != 0) {
            iM24096 += AbstractC14846.m35772(27);
        }
        if ((this.f10634 & 2048) != 0) {
            iM24096 += AbstractC14846.m35772(31);
        }
        if ((this.f10634 & 4096) != 0) {
            iM24096 += AbstractC9035.m24096(36, this.f10626);
        }
        if ((this.f10634 & 8192) != 0) {
            iM24096 += AbstractC9035.m24096(37, this.f10622);
        }
        if ((this.f10634 & 16384) != 0) {
            iM24096 += AbstractC9035.m24096(39, this.f10627);
        }
        if ((this.f10634 & 32768) != 0) {
            iM24096 += AbstractC9035.m24096(40, this.f10633);
        }
        if ((this.f10634 & 65536) != 0) {
            iM24096 += AbstractC9035.m24096(41, this.f10628);
        }
        if ((this.f10634 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            iM24096 += AbstractC9035.m24096(44, this.f10630);
        }
        if ((this.f10634 & 262144) != 0) {
            iM24096 += AbstractC9035.m24096(45, this.f10617);
        }
        if ((this.f10634 & 524288) != 0) {
            iM24096 += AbstractC14846.m35774(50, m10737());
        }
        for (int i2 = 0; i2 < this.f10637.size(); i2++) {
            iM24096 += AbstractC14846.m35774(EnumC5810.f19979, (InterfaceC18775) this.f10637.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM24096 + m28523();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3266)) {
            return super.equals(obj);
        }
        C3266 c3266 = (C3266) obj;
        if (m10720() != c3266.m10720()) {
            return false;
        }
        if ((m10720() && !m10708().equals(c3266.m10708())) || m10723() != c3266.m10723()) {
            return false;
        }
        if ((m10723() && !m10739().equals(c3266.m10739())) || m10732() != c3266.m10732()) {
            return false;
        }
        if ((m10732() && this.f10623 != c3266.f10623) || m10717() != c3266.m10717()) {
            return false;
        }
        if ((m10717() && this.f10624 != c3266.f10624) || m10710() != c3266.m10710()) {
            return false;
        }
        if ((m10710() && this.f10619 != c3266.f10619) || m10718() != c3266.m10718()) {
            return false;
        }
        if ((m10718() && this.f10636 != c3266.f10636) || m10735() != c3266.m10735()) {
            return false;
        }
        if ((m10735() && !m10706().equals(c3266.m10706())) || m10714() != c3266.m10714()) {
            return false;
        }
        if ((m10714() && this.f10615 != c3266.f10615) || m10736() != c3266.m10736()) {
            return false;
        }
        if ((m10736() && this.f10618 != c3266.f10618) || m10725() != c3266.m10725()) {
            return false;
        }
        if ((m10725() && this.f10620 != c3266.f10620) || m10721() != c3266.m10721()) {
            return false;
        }
        if ((m10721() && this.f10632 != c3266.f10632) || m10705() != c3266.m10705()) {
            return false;
        }
        if ((m10705() && this.f10631 != c3266.f10631) || m10704() != c3266.m10704()) {
            return false;
        }
        if ((m10704() && !m10734().equals(c3266.m10734())) || m10712() != c3266.m10712()) {
            return false;
        }
        if ((m10712() && !m10728().equals(c3266.m10728())) || m10707() != c3266.m10707()) {
            return false;
        }
        if ((m10707() && !m10715().equals(c3266.m10715())) || m10741() != c3266.m10741()) {
            return false;
        }
        if ((m10741() && !m10702().equals(c3266.m10702())) || m10729() != c3266.m10729()) {
            return false;
        }
        if ((m10729() && !m10731().equals(c3266.m10731())) || m10727() != c3266.m10727()) {
            return false;
        }
        if ((m10727() && !m10713().equals(c3266.m10713())) || m10738() != c3266.m10738()) {
            return false;
        }
        if ((!m10738() || m10703().equals(c3266.m10703())) && m10709() == c3266.m10709()) {
            return (!m10709() || m10737().equals(c3266.m10737())) && this.f10637.equals(c3266.f10637) && getUnknownFields().equals(c3266.getUnknownFields()) && m28526().equals(c3266.m28526());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12543.f40294.hashCode() + 779;
        if (m10720()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + m10708().hashCode();
        }
        if (m10723()) {
            iHashCode = C18176.m42345(iHashCode, 37, 8, 53) + m10739().hashCode();
        }
        if (m10732()) {
            iHashCode = C18176.m42345(iHashCode, 37, 10, 53) + C23447.m52661(this.f10623);
        }
        if (m10717()) {
            iHashCode = C18176.m42345(iHashCode, 37, 20, 53) + C23447.m52661(this.f10624);
        }
        if (m10710()) {
            iHashCode = C18176.m42345(iHashCode, 37, 27, 53) + C23447.m52661(this.f10619);
        }
        if (m10718()) {
            iHashCode = C18176.m42345(iHashCode, 37, 9, 53) + this.f10636;
        }
        if (m10735()) {
            iHashCode = C18176.m42345(iHashCode, 37, 11, 53) + m10706().hashCode();
        }
        if (m10714()) {
            iHashCode = C18176.m42345(iHashCode, 37, 16, 53) + C23447.m52661(this.f10615);
        }
        if (m10736()) {
            iHashCode = C18176.m42345(iHashCode, 37, 17, 53) + C23447.m52661(this.f10618);
        }
        if (m10725()) {
            iHashCode = C18176.m42345(iHashCode, 37, 18, 53) + C23447.m52661(this.f10620);
        }
        if (m10721()) {
            iHashCode = C18176.m42345(iHashCode, 37, 23, 53) + C23447.m52661(this.f10632);
        }
        if (m10705()) {
            iHashCode = C18176.m42345(iHashCode, 37, 31, 53) + C23447.m52661(this.f10631);
        }
        if (m10704()) {
            iHashCode = C18176.m42345(iHashCode, 37, 36, 53) + m10734().hashCode();
        }
        if (m10712()) {
            iHashCode = C18176.m42345(iHashCode, 37, 37, 53) + m10728().hashCode();
        }
        if (m10707()) {
            iHashCode = C18176.m42345(iHashCode, 37, 39, 53) + m10715().hashCode();
        }
        if (m10741()) {
            iHashCode = C18176.m42345(iHashCode, 37, 40, 53) + m10702().hashCode();
        }
        if (m10729()) {
            iHashCode = C18176.m42345(iHashCode, 37, 41, 53) + m10731().hashCode();
        }
        if (m10727()) {
            iHashCode = C18176.m42345(iHashCode, 37, 44, 53) + m10713().hashCode();
        }
        if (m10738()) {
            iHashCode = C18176.m42345(iHashCode, 37, 45, 53) + m10703().hashCode();
        }
        if (m10709()) {
            iHashCode = C18176.m42345(iHashCode, 37, 50, 53) + m10737().hashCode();
        }
        if (this.f10637.size() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, EnumC5810.f19979, 53) + this.f10637.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC19124.m44248(iHashCode, m28526()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C17436 newBuilder() {
        return f10614.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 newBuilderForType() {
        return f10614.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 newBuilderForType() {
        return f10614.toBuilder();
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C17436 toBuilder() {
        int i = 0;
        if (this == f10614) {
            return new C17436(i);
        }
        C17436 c17436 = new C17436(i);
        c17436.m40936(this);
        return c17436;
    }

    @Override // l.AbstractC19124
    public final InterfaceC14299 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C17436(interfaceC7937, 0);
    }

    public static C3266 getDefaultInstance() {
        return f10614;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return f10612;
    }

    @Override // l.AbstractC11272, l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return f10614;
    }

    @Override // l.AbstractC11272, l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return f10614;
    }
}
