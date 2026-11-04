package l;

import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩺᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes.dex */
public final class C24626 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f79746;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f79747;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f79748;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19404 f79749;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10745 f79750;

    public C24626(ViewOnClickListenerC19404 viewOnClickListenerC19404, int i, HashSet hashSet, String str) {
        this.f79749 = viewOnClickListenerC19404;
        this.f79748 = i;
        this.f79746 = hashSet;
        this.f79747 = str;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        ViewOnClickListenerC19404 viewOnClickListenerC19404 = this.f79749;
        viewOnClickListenerC19404.f62714.m46621();
        C10745 c10745 = new C10745((AbstractActivityC17204) viewOnClickListenerC19404.requireActivity());
        c10745.m27397(R.string.MT_Protector);
        c10745.mo25916((Runnable) null);
        c10745.mo25931();
        this.f79750 = c10745;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException, C4866 {
        ViewOnClickListenerC19404 viewOnClickListenerC19404 = this.f79749;
        String str = this.f79747;
        HashSet<String> hashSet = this.f79746;
        int i = this.f79748;
        if (i == 0) {
            C3374 c3374 = new C3374(hashSet.size());
            C10745 c10745 = this.f79750;
            C17359.requireNonNull(c10745);
            c3374.m11078(new C21151(c10745));
            C25179 c25179 = new C25179(str);
            try {
                C8018 c8018 = new C8018(new BufferedOutputStream(c25179.m56119()));
                C0560 c0560 = new C0560();
                for (String str2 : hashSet) {
                    if (!this.f79750.m27399()) {
                        c3374.m11079(1);
                        c25179.m56124(str2 + ".smali");
                        C20283 c20283 = viewOnClickListenerC19404.f62714;
                        c0560.m2567();
                        c20283.m46578(str2, c0560);
                        c8018.append((CharSequence) c0560.m2566());
                        c8018.flush();
                    } else {
                        c25179.close();
                        return;
                    }
                }
                c25179.close();
                return;
            } catch (Throwable th) {
                try {
                    c25179.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (i == 1) {
            C3374 c3375 = new C3374(hashSet.size());
            C10745 c10746 = this.f79750;
            C17359.requireNonNull(c10746);
            c3375.m11078(new C21151(c10746));
            C8850 c8850M19516 = null;
            for (String str3 : hashSet) {
                if (this.f79750.m27399()) {
                    return;
                }
                c3375.m11079(1);
                InterfaceC14906 interfaceC14906M46618 = viewOnClickListenerC19404.f62714.m46618(str3);
                C17359.requireNonNull(interfaceC14906M46618);
                if (c8850M19516 == null) {
                    c8850M19516 = interfaceC14906M46618.mo10206().m19516();
                }
                c8850M19516.m23712((InterfaceC10122) interfaceC14906M46618.mo10203());
                if (c8850M19516.m52045()) {
                    throw new C4866(R.string.MT_Protector);
                }
            }
            if (c8850M19516 != null) {
                c8850M19516.m52043(new C4881(C14584.m35193(str, new String[0])));
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        C3374 c3376 = new C3374(hashSet.size());
        C10745 c10747 = this.f79750;
        C17359.requireNonNull(c10747);
        c3376.m11078(new C21151(c10747));
        C22781 c22781 = new C22781();
        C25179 c251710 = new C25179(str);
        try {
            for (String str4 : hashSet) {
                if (!this.f79750.m27399()) {
                    c3376.m11079(1);
                    InterfaceC14906 interfaceC14906M46619 = viewOnClickListenerC19404.f62714.m46618(str4);
                    C17359.requireNonNull(interfaceC14906M46619);
                    C8850 c8850M19517 = interfaceC14906M46619.mo10206().m19516();
                    c8850M19517.m23712((InterfaceC10122) interfaceC14906M46619.mo10203());
                    c22781.m51384();
                    c8850M19517.m52043(c22781);
                    byte[] bArrM17226 = C5918.m17223(ByteBuffer.wrap(c22781.m51382(), 0, c22781.m51383())).m17226();
                    c251710.m56124(str4 + ".class");
                    c251710.write(bArrM17226);
                } else {
                    c251710.close();
                    return;
                }
            }
            c251710.close();
        } catch (Throwable th3) {
            try {
                c251710.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f79750.m27399()) {
            C22673.m51152(R.string.MT_Protector);
            C14584.m35193(this.f79747, new String[0]).mo4296();
            return;
        }
        C22673.m51152(R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f79749.f62712.m51299(exc);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f79749.f62714.m46573();
        this.f79750.m27405();
    }
}
