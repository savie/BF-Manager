package l;

import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7M7 */
/* JADX INFO: loaded from: classes4.dex */
public class C10338 implements InterfaceC16722 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16722 f32939;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC16722 f32940;

    public /* synthetic */ C10338(InterfaceC16722 interfaceC16722, InterfaceC20452 interfaceC20452) {
        this(interfaceC16722, (InterfaceC16722) interfaceC20452);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26601(C4747 c4747, InterfaceC16722 interfaceC16722, InterfaceC16722 interfaceC16723) {
        Object c10338;
        c4747.m14644(InterfaceC16722.class, (Object) null);
        if (interfaceC16723 instanceof InterfaceC20452) {
            c10338 = new C19289(interfaceC16722, (InterfaceC20452) interfaceC16723);
        } else {
            c10338 = new C10338(interfaceC16722, interfaceC16723);
        }
        c4747.m14644(InterfaceC16722.class, c10338);
    }

    public C10338(InterfaceC16722 interfaceC16722, InterfaceC16722 interfaceC16723) {
        this.f32940 = interfaceC16722;
        this.f32939 = interfaceC16723;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private InterfaceC16722 m26602(InterfaceC24928 interfaceC24928) {
        InterfaceC16722 interfaceC16722 = this.f32940;
        return interfaceC16722.mo6989(interfaceC24928) ? interfaceC16722 : this.f32939;
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ۤ */
    public final ClassLoader mo6991(InterfaceC24928 interfaceC24928) {
        return m26602(interfaceC24928).mo6991(interfaceC24928);
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo6977(InterfaceC24928 interfaceC24928, String str, Set set, boolean z) {
        return m26602(interfaceC24928).mo6977(interfaceC24928, str, set, z);
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ۙ */
    public final String mo6978(InterfaceC24928 interfaceC24928, InterfaceC15976 interfaceC15976) {
        return m26602(interfaceC24928).mo6978(interfaceC24928, interfaceC15976);
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ۙ */
    public boolean mo6988(InterfaceC11501 interfaceC11501, InterfaceC11501 interfaceC11502) {
        return this.f32939.mo6988(interfaceC11501, interfaceC11502);
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo26605(Iterator it, String str) {
        return this.f32939.mo26605(it, str);
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6989(InterfaceC24928 interfaceC24928) {
        return this.f32940.mo6989(interfaceC24928) || this.f32939.mo6989(interfaceC24928);
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15976 mo6983(InterfaceC24928 interfaceC24928, String str, EnumC17468 enumC17468) {
        return m26602(interfaceC24928).mo6983(interfaceC24928, str, enumC17468);
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15976 mo6984(InterfaceC24928 interfaceC24928, String str, EnumC17468 enumC17468, InterfaceC11501 interfaceC11501) {
        return m26602(interfaceC24928).mo6984(interfaceC24928, str, enumC17468, interfaceC11501);
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11501 mo6982(InterfaceC24928 interfaceC24928, String str) {
        return m26602(interfaceC24928).mo6982(interfaceC24928, str);
    }

    @Override // l.InterfaceC16722, java.io.Flushable
    public final void flush() {
        this.f32940.flush();
        this.f32939.flush();
    }

    @Override // l.InterfaceC16722, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f32940.close();
        this.f32939.close();
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC24928 mo6994(InterfaceC24928 interfaceC24928, String str) {
        return m26602(interfaceC24928).mo6994(interfaceC24928, str);
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC24928 mo6995(InterfaceC24928 interfaceC24928, InterfaceC15976 interfaceC15976) {
        return m26602(interfaceC24928).mo6995(interfaceC24928, interfaceC15976);
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ۙ */
    public final ServiceLoader mo6980(InterfaceC24928 interfaceC24928, Class cls) {
        return m26602(interfaceC24928).mo6980(interfaceC24928, cls);
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ᩸ */
    public final String mo6996(InterfaceC24928 interfaceC24928) {
        return m26602(interfaceC24928).mo6996(interfaceC24928);
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ᩷ */
    public final Iterable mo6993(InterfaceC24928 interfaceC24928) {
        return m26602(interfaceC24928).mo6993(interfaceC24928);
    }

    @Override // l.InterfaceC16722
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6990(InterfaceC24928 interfaceC24928, InterfaceC11501 interfaceC11501) {
        return m26602(interfaceC24928).mo6990(interfaceC24928, interfaceC11501);
    }

    @Override // l.InterfaceC23436
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo26603(String str) {
        return this.f32939.mo26603(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16722 m26604() {
        return this.f32939;
    }
}
