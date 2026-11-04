package l;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۛۘۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: YITH */
/* JADX INFO: loaded from: classes3.dex */
public final class C6129 implements Closeable {

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f20904 = C16980.m40037(C6129.class);

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static final int f20905 = Math.max(1, Runtime.getRuntime().availableProcessors() / 2);

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static final String f20903 = System.lineSeparator();

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f20930 = new ArrayList(1);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C22842 f20929 = new C22842();

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public C4306 f20925 = new C4306();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C20299 f20913 = new C20299(0);

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f20933 = f20905;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public boolean f20918 = false;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f20923 = true;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f20916 = true;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f20912 = true;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f20920 = true;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f20910 = true;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f20921 = true;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f20928 = true;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f20911 = true;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f20908 = true;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public EnumC15823 f20907 = EnumC15823.AUTO;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f20906 = f20903;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f20926 = ASN1Dump.TAB;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EnumC17315 f20927 = EnumC17315.INFO;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public EnumC9110 f20917 = EnumC9110.AUTO;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f20924 = 10;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public EnumC12094 f20932 = EnumC12094.APPLY;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C21739 f20915 = new C21739();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f20909 = new ArrayList();

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f20919 = new HashMap();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public HashSet f20914 = new HashSet();

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C15492 f20922 = new C15492();

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f20931 = true;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C21739 c21739 = this.f20915;
        try {
            C22842 c22842 = this.f20929;
            if (c22842 != null) {
                c22842.close();
            }
            C4306 c4306 = this.f20925;
            if (c4306 != null) {
                c4306.close();
            }
        } catch (Exception e) {
            f20904.mo13724("Failed to close JadxArgs", (Throwable) e);
        } finally {
            c21739.close();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList m17723() {
        return this.f20930;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final void m17712() {
        this.f20933 = Math.max(1, 1);
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17717() {
        return this.f20918;
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final void m17695() {
        this.f20918 = true;
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17710() {
        return this.f20923;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m17702() {
        return this.f20916;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m17694() {
        return this.f20920 && !this.f20907.m37753();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m17703() {
        return this.f20910;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m17693() {
        return this.f20921;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m17707() {
        return this.f20928;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m17716() {
        return this.f20912;
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17721() {
        return this.f20911;
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17722() {
        return this.f20908;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final EnumC15823 m17700() {
        return this.f20907;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17699(EnumC15823 enumC15823) {
        this.f20907 = enumC15823;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22842 m17698() {
        return this.f20929;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20299 m17709() {
        return this.f20913;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4306 m17719() {
        return this.f20925;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m17720() {
        return this.f20926;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m17704() {
        return this.f20906;
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final void m17706() {
        this.f20906 = "\n";
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final EnumC17315 m17705() {
        return this.f20927;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final EnumC9110 m17696() {
        return this.f20917;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m17708() {
        return this.f20924;
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final void m17714() {
        this.f20924 = Math.max(1, 20);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC12094 m17715() {
        return this.f20932;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList m17713() {
        return this.f20909;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final HashMap m17697() {
        return this.f20919;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final HashSet m17711() {
        return this.f20914;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C15492 m17718() {
        return this.f20922;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m17701() {
        return this.f20931;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JadxArgs{inputFiles=");
        sb.append(this.f20930);
        sb.append(", threadsCount=");
        sb.append(this.f20933);
        sb.append(", decompilationMode=");
        sb.append(this.f20907);
        sb.append(", showInconsistentCode=");
        sb.append(this.f20918);
        sb.append(", useImports=");
        sb.append(this.f20923);
        sb.append(", useKotlinMethodsForVarNames=");
        sb.append(this.f20932);
        sb.append(", insertDebugLines=false, extractFinally=");
        sb.append(this.f20912);
        sb.append(", escapeUnicode=false, replaceConsts=");
        sb.append(this.f20911);
        sb.append(", restoreSwitchOverString=");
        sb.append(this.f20908);
        sb.append(", respectBytecodeAccModifiers=false, commentsLevel=");
        sb.append(this.f20927);
        sb.append(", codeCache=");
        sb.append(this.f20929);
        sb.append(", codeWriter=");
        this.f20913.getClass();
        sb.append(new C10907(this).getClass().getSimpleName());
        sb.append(", pluginOptions=");
        sb.append(this.f20919);
        sb.append(", typeUpdatesLimitCount=");
        sb.append(this.f20924);
        sb.append('}');
        return sb.toString();
    }
}
