package l;

import android.os.Messenger;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes4.dex */
public class C12489 implements InterfaceC3540 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Messenger f40097;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public MediaBrowserService f40098;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f40099 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractServiceC13191 f40100;

    public C12489(AbstractServiceC13191 abstractServiceC13191) {
        this.f40100 = abstractServiceC13191;
    }

    @Override // l.InterfaceC3540
    public void onCreate() {
        C20694 c20694 = new C20694(this, this.f40100);
        this.f40098 = c20694;
        c20694.onCreate();
    }
}
