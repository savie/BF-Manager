package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩺᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 76RQ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC24614 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f79725;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f79726;

    public /* synthetic */ RunnableC24614(int i, Object obj) {
        this.f79725 = i;
        this.f79726 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f79725;
        Object obj = this.f79726;
        switch (i) {
            case 0:
                InterfaceC24329 interfaceC24329 = (InterfaceC24329) obj;
                try {
                    EnumC20599 enumC20599 = EnumC20599.NOFOLLOW_LINKS;
                    if (C3445.isDirectory(interfaceC24329, enumC20599)) {
                        if (C3445.exists(interfaceC24329.resolve("session.lock"), enumC20599)) {
                            C17505.m41065(interfaceC24329);
                            return;
                        }
                        InterfaceC20670 list = C3445.list(interfaceC24329);
                        try {
                            if (list.findAny().isPresent()) {
                                list.close();
                                return;
                            }
                            list.close();
                            C3445.deleteIfExists(interfaceC24329);
                            InterfaceC22465.f72702.mo26981(interfaceC24329.getParent());
                            return;
                        } catch (Throwable th) {
                            if (list != null) {
                                try {
                                    list.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                break;
                            }
                            throw th;
                        }
                    }
                    return;
                } catch (IOException e) {
                    throw new C3552(e);
                }
            case 1:
                ((C7941) obj).m21572();
                return;
            default:
                C6331.m18054((String) obj);
                return;
        }
    }
}
