package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M6E4 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15113 implements Consumer {
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        C24927 c24927 = (C24927) obj;
        C11457 c11457 = C11457.f36004;
        C24927 c24927M12936 = ((C4000) c24927.mo17862((InterfaceC2157) c11457)).m12936();
        c24927.m55576(C6823.m19001(c24927.m55567(), (AbstractC12531) c24927M12936.m55556()));
        c24927M12936.m55557(C6823.m19001(c24927M12936.m55533(), (AbstractC12531) c24927));
        c24927.m39419(c11457);
        c24927.m39418(EnumC1763.DONT_GENERATE);
        for (C2551 c2551 : c24927.getMethods()) {
            if (c2551.m8529()) {
                c2551.m39418(EnumC1763.ANONYMOUS_CONSTRUCTOR);
            }
        }
        c24927.m31133("Anonymous mark cleared");
    }
}
