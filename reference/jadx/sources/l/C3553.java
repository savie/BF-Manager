package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3553 extends AbstractC6229 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f13069 = 0;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC6271 f13070;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final C3553 f13071;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f13072;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public volatile Object f13073;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f13074;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f13075;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile Object f13076;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public volatile Object f13077;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f13078;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public volatile Object f13079;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C23539 f13080;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public volatile Object f13081;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public volatile Object f13082;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile Object f13083;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public volatile Object f13084;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile Object f13085;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f13086;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public byte f13087;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f13088;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f13089;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f13090;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f13091;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public volatile Object f13092;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public List f13093;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f13094;

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        C17518 c17518 = new C17518(this);
        if ((this.f13091 & 1) != 0) {
            AbstractC18245.m42405(abstractC22044, 1, this.f13076);
        }
        if ((this.f13091 & 2) != 0) {
            AbstractC18245.m42405(abstractC22044, 8, this.f13082);
        }
        if ((this.f13091 & 32) != 0) {
            abstractC22044.mo14252(9, this.f13075);
        }
        if ((this.f13091 & 4) != 0) {
            abstractC22044.mo14240(10, this.f13074);
        }
        if ((this.f13091 & 64) != 0) {
            AbstractC18245.m42405(abstractC22044, 11, this.f13083);
        }
        if ((this.f13091 & 128) != 0) {
            abstractC22044.mo14240(16, this.f13089);
        }
        if ((this.f13091 & 256) != 0) {
            abstractC22044.mo14240(17, this.f13088);
        }
        if ((this.f13091 & 512) != 0) {
            abstractC22044.mo14240(18, this.f13086);
        }
        if ((this.f13091 & 8) != 0) {
            abstractC22044.mo14240(20, this.f13094);
        }
        if ((this.f13091 & 1024) != 0) {
            abstractC22044.mo14240(23, this.f13090);
        }
        if ((this.f13091 & 16) != 0) {
            abstractC22044.mo14240(27, this.f13078);
        }
        if ((this.f13091 & 2048) != 0) {
            abstractC22044.mo14240(31, this.f13072);
        }
        if ((this.f13091 & 4096) != 0) {
            AbstractC18245.m42405(abstractC22044, 36, this.f13084);
        }
        if ((this.f13091 & 8192) != 0) {
            AbstractC18245.m42405(abstractC22044, 37, this.f13085);
        }
        if ((this.f13091 & 16384) != 0) {
            AbstractC18245.m42405(abstractC22044, 39, this.f13081);
        }
        if ((this.f13091 & 32768) != 0) {
            AbstractC18245.m42405(abstractC22044, 40, this.f13079);
        }
        if ((this.f13091 & 65536) != 0) {
            AbstractC18245.m42405(abstractC22044, 41, this.f13073);
        }
        if ((this.f13091 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            AbstractC18245.m42405(abstractC22044, 44, this.f13092);
        }
        if ((this.f13091 & 262144) != 0) {
            AbstractC18245.m42405(abstractC22044, 45, this.f13077);
        }
        if ((this.f13091 & 524288) != 0) {
            abstractC22044.mo14254(50, m10534());
        }
        for (int i = 0; i < this.f13093.size(); i++) {
            abstractC22044.mo14254(EnumC12167.f40728, (InterfaceC23206) this.f13093.get(i));
        }
        c17518.m40779(536870912, abstractC22044);
        getUnknownFields().writeTo(abstractC22044);
    }

    static {
        C3844.m11171(EnumC13018.PUBLIC, C3553.class.getName());
        f13071 = new C3553();
        f13070 = new C24016();
    }

    public C3553(C14844 c14844) {
        super(c14844);
        this.f13076 = "";
        this.f13082 = "";
        this.f13074 = false;
        this.f13094 = false;
        this.f13078 = false;
        this.f13075 = 1;
        this.f13083 = "";
        this.f13089 = false;
        this.f13088 = false;
        this.f13086 = false;
        this.f13090 = false;
        this.f13072 = true;
        this.f13084 = "";
        this.f13085 = "";
        this.f13081 = "";
        this.f13079 = "";
        this.f13073 = "";
        this.f13092 = "";
        this.f13077 = "";
        this.f13087 = (byte) -1;
    }

    public C3553() {
        this.f13076 = "";
        this.f13082 = "";
        this.f13074 = false;
        this.f13094 = false;
        this.f13078 = false;
        this.f13075 = 1;
        this.f13083 = "";
        this.f13089 = false;
        this.f13088 = false;
        this.f13086 = false;
        this.f13090 = false;
        this.f13072 = true;
        this.f13084 = "";
        this.f13085 = "";
        this.f13081 = "";
        this.f13079 = "";
        this.f13073 = "";
        this.f13092 = "";
        this.f13077 = "";
        this.f13087 = (byte) -1;
        this.f13076 = "";
        this.f13082 = "";
        this.f13075 = 1;
        this.f13083 = "";
        this.f13072 = true;
        this.f13084 = "";
        this.f13085 = "";
        this.f13081 = "";
        this.f13079 = "";
        this.f13073 = "";
        this.f13092 = "";
        this.f13077 = "";
        this.f13093 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC18245
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46323;
        c6956.m18696(C3553.class, C14844.class);
        return c6956;
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10506() {
        return (this.f13091 & 1) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m10538() {
        Object obj = this.f13076;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f13076 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10541() {
        return (this.f13091 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String m10515() {
        Object obj = this.f13082;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f13082 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10512() {
        return (this.f13091 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m10520() {
        return this.f13074;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10522() {
        return (this.f13091 & 8) != 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m10536() {
        return this.f13094;
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10524() {
        return (this.f13091 & 16) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m10529() {
        return this.f13078;
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10514() {
        return (this.f13091 & 32) != 0;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final EnumC9905 m10505() {
        EnumC9905 enumC9905M25090 = EnumC9905.m25090(this.f13075);
        return enumC9905M25090 == null ? EnumC9905.SPEED : enumC9905M25090;
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10525() {
        return (this.f13091 & 64) != 0;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m10516() {
        Object obj = this.f13083;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f13083 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m10507() {
        return (this.f13091 & 128) != 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m10527() {
        return this.f13089;
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10508() {
        return (this.f13091 & 256) != 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m10518() {
        return this.f13088;
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10533() {
        return (this.f13091 & 512) != 0;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m10513() {
        return this.f13086;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m10509() {
        return (this.f13091 & 1024) != 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m10532() {
        return this.f13090;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m10526() {
        return (this.f13091 & 2048) != 0;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m10542() {
        return this.f13072;
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10510() {
        return (this.f13091 & 4096) != 0;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String m10537() {
        Object obj = this.f13084;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f13084 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m10519() {
        return (this.f13091 & 8192) != 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m10539() {
        Object obj = this.f13085;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f13085 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10517() {
        return (this.f13091 & 16384) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m10544() {
        Object obj = this.f13081;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f13081 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10543() {
        return (this.f13091 & 32768) != 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m10530() {
        Object obj = this.f13079;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f13079 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10540() {
        return (this.f13091 & 65536) != 0;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m10531() {
        Object obj = this.f13073;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f13073 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10528() {
        return (this.f13091 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m10523() {
        Object obj = this.f13092;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f13092 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10535() {
        return (this.f13091 & 262144) != 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m10521() {
        Object obj = this.f13077;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.f13077 = strM52260;
        }
        return strM52260;
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10511() {
        return (this.f13091 & 524288) != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C23539 m10534() {
        C23539 c23539 = this.f13080;
        return c23539 == null ? C23539.getDefaultInstance() : c23539;
    }

    @Override // l.AbstractC6229, l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        byte b = this.f13087;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m10511() || m10534().isInitialized()) {
            for (int i = 0; i < this.f13093.size(); i++) {
                if (!((C4923) this.f13093.get(i)).isInitialized()) {
                    this.f13087 = (byte) 0;
                    return false;
                }
            }
            if (!m17285()) {
                this.f13087 = (byte) 0;
                return false;
            }
            this.f13087 = (byte) 1;
            return true;
        }
        this.f13087 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM42390 = (this.f13091 & 1) != 0 ? AbstractC18245.m42390(1, this.f13076) : 0;
        if ((this.f13091 & 2) != 0) {
            iM42390 += AbstractC18245.m42390(8, this.f13082);
        }
        if ((this.f13091 & 32) != 0) {
            iM42390 += AbstractC22044.m48966(9, this.f13075);
        }
        if ((this.f13091 & 4) != 0) {
            iM42390 += AbstractC22044.m48961(10);
        }
        if ((this.f13091 & 64) != 0) {
            iM42390 += AbstractC18245.m42390(11, this.f13083);
        }
        if ((this.f13091 & 128) != 0) {
            iM42390 += AbstractC22044.m48961(16);
        }
        if ((this.f13091 & 256) != 0) {
            iM42390 += AbstractC22044.m48961(17);
        }
        if ((this.f13091 & 512) != 0) {
            iM42390 += AbstractC22044.m48961(18);
        }
        if ((this.f13091 & 8) != 0) {
            iM42390 += AbstractC22044.m48961(20);
        }
        if ((this.f13091 & 1024) != 0) {
            iM42390 += AbstractC22044.m48961(23);
        }
        if ((this.f13091 & 16) != 0) {
            iM42390 += AbstractC22044.m48961(27);
        }
        if ((this.f13091 & 2048) != 0) {
            iM42390 += AbstractC22044.m48961(31);
        }
        if ((this.f13091 & 4096) != 0) {
            iM42390 += AbstractC18245.m42390(36, this.f13084);
        }
        if ((this.f13091 & 8192) != 0) {
            iM42390 += AbstractC18245.m42390(37, this.f13085);
        }
        if ((this.f13091 & 16384) != 0) {
            iM42390 += AbstractC18245.m42390(39, this.f13081);
        }
        if ((this.f13091 & 32768) != 0) {
            iM42390 += AbstractC18245.m42390(40, this.f13079);
        }
        if ((this.f13091 & 65536) != 0) {
            iM42390 += AbstractC18245.m42390(41, this.f13073);
        }
        if ((this.f13091 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            iM42390 += AbstractC18245.m42390(44, this.f13092);
        }
        if ((this.f13091 & 262144) != 0) {
            iM42390 += AbstractC18245.m42390(45, this.f13077);
        }
        if ((this.f13091 & 524288) != 0) {
            iM42390 += AbstractC22044.m48963(50, m10534());
        }
        for (int i2 = 0; i2 < this.f13093.size(); i2++) {
            iM42390 += AbstractC22044.m48963(EnumC12167.f40728, (InterfaceC23206) this.f13093.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM42390 + m17282();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3553)) {
            return super.equals(obj);
        }
        C3553 c3553 = (C3553) obj;
        if (m10506() != c3553.m10506()) {
            return false;
        }
        if ((m10506() && !m10538().equals(c3553.m10538())) || m10541() != c3553.m10541()) {
            return false;
        }
        if ((m10541() && !m10515().equals(c3553.m10515())) || m10512() != c3553.m10512()) {
            return false;
        }
        if ((m10512() && this.f13074 != c3553.f13074) || m10522() != c3553.m10522()) {
            return false;
        }
        if ((m10522() && this.f13094 != c3553.f13094) || m10524() != c3553.m10524()) {
            return false;
        }
        if ((m10524() && this.f13078 != c3553.f13078) || m10514() != c3553.m10514()) {
            return false;
        }
        if ((m10514() && this.f13075 != c3553.f13075) || m10525() != c3553.m10525()) {
            return false;
        }
        if ((m10525() && !m10516().equals(c3553.m10516())) || m10507() != c3553.m10507()) {
            return false;
        }
        if ((m10507() && this.f13089 != c3553.f13089) || m10508() != c3553.m10508()) {
            return false;
        }
        if ((m10508() && this.f13088 != c3553.f13088) || m10533() != c3553.m10533()) {
            return false;
        }
        if ((m10533() && this.f13086 != c3553.f13086) || m10509() != c3553.m10509()) {
            return false;
        }
        if ((m10509() && this.f13090 != c3553.f13090) || m10526() != c3553.m10526()) {
            return false;
        }
        if ((m10526() && this.f13072 != c3553.f13072) || m10510() != c3553.m10510()) {
            return false;
        }
        if ((m10510() && !m10537().equals(c3553.m10537())) || m10519() != c3553.m10519()) {
            return false;
        }
        if ((m10519() && !m10539().equals(c3553.m10539())) || m10517() != c3553.m10517()) {
            return false;
        }
        if ((m10517() && !m10544().equals(c3553.m10544())) || m10543() != c3553.m10543()) {
            return false;
        }
        if ((m10543() && !m10530().equals(c3553.m10530())) || m10540() != c3553.m10540()) {
            return false;
        }
        if ((m10540() && !m10531().equals(c3553.m10531())) || m10528() != c3553.m10528()) {
            return false;
        }
        if ((m10528() && !m10523().equals(c3553.m10523())) || m10535() != c3553.m10535()) {
            return false;
        }
        if ((!m10535() || m10521().equals(c3553.m10521())) && m10511() == c3553.m10511()) {
            return (!m10511() || m10534().equals(c3553.m10534())) && this.f13093.equals(c3553.f13093) && getUnknownFields().equals(c3553.getUnknownFields()) && m17283().equals(c3553.m17283());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C14097.f46278.hashCode() + 779;
        if (m10506()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + m10538().hashCode();
        }
        if (m10541()) {
            iHashCode = C17922.m41614(iHashCode, 37, 8, 53) + m10515().hashCode();
        }
        if (m10512()) {
            iHashCode = C17922.m41614(iHashCode, 37, 10, 53) + C9779.m24888(this.f13074);
        }
        if (m10522()) {
            iHashCode = C17922.m41614(iHashCode, 37, 20, 53) + C9779.m24888(this.f13094);
        }
        if (m10524()) {
            iHashCode = C17922.m41614(iHashCode, 37, 27, 53) + C9779.m24888(this.f13078);
        }
        if (m10514()) {
            iHashCode = C17922.m41614(iHashCode, 37, 9, 53) + this.f13075;
        }
        if (m10525()) {
            iHashCode = C17922.m41614(iHashCode, 37, 11, 53) + m10516().hashCode();
        }
        if (m10507()) {
            iHashCode = C17922.m41614(iHashCode, 37, 16, 53) + C9779.m24888(this.f13089);
        }
        if (m10508()) {
            iHashCode = C17922.m41614(iHashCode, 37, 17, 53) + C9779.m24888(this.f13088);
        }
        if (m10533()) {
            iHashCode = C17922.m41614(iHashCode, 37, 18, 53) + C9779.m24888(this.f13086);
        }
        if (m10509()) {
            iHashCode = C17922.m41614(iHashCode, 37, 23, 53) + C9779.m24888(this.f13090);
        }
        if (m10526()) {
            iHashCode = C17922.m41614(iHashCode, 37, 31, 53) + C9779.m24888(this.f13072);
        }
        if (m10510()) {
            iHashCode = C17922.m41614(iHashCode, 37, 36, 53) + m10537().hashCode();
        }
        if (m10519()) {
            iHashCode = C17922.m41614(iHashCode, 37, 37, 53) + m10539().hashCode();
        }
        if (m10517()) {
            iHashCode = C17922.m41614(iHashCode, 37, 39, 53) + m10544().hashCode();
        }
        if (m10543()) {
            iHashCode = C17922.m41614(iHashCode, 37, 40, 53) + m10530().hashCode();
        }
        if (m10540()) {
            iHashCode = C17922.m41614(iHashCode, 37, 41, 53) + m10531().hashCode();
        }
        if (m10528()) {
            iHashCode = C17922.m41614(iHashCode, 37, 44, 53) + m10523().hashCode();
        }
        if (m10535()) {
            iHashCode = C17922.m41614(iHashCode, 37, 45, 53) + m10521().hashCode();
        }
        if (m10511()) {
            iHashCode = C17922.m41614(iHashCode, 37, 50, 53) + m10534().hashCode();
        }
        if (this.f13093.size() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, EnumC12167.f40728, 53) + this.f13093.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC23019.m50911(iHashCode, m17283()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C14844 newBuilder() {
        return f13071.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 newBuilderForType() {
        return f13071.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 newBuilderForType() {
        return f13071.toBuilder();
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C14844 toBuilder() {
        int i = 0;
        if (this == f13071) {
            return new C14844(i);
        }
        C14844 c14844 = new C14844(i);
        c14844.m35534(this);
        return c14844;
    }

    @Override // l.AbstractC23019
    public final InterfaceC22500 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C14844(interfaceC6790, 0);
    }

    public static C3553 getDefaultInstance() {
        return f13071;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return f13070;
    }

    @Override // l.AbstractC6229, l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return f13071;
    }

    @Override // l.AbstractC6229, l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return f13071;
    }
}
