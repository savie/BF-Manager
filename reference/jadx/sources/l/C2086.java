package l;

import android.os.Messenger;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes2.dex */
public class C2086 implements InterfaceC23960 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractServiceC21032 f7712;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Messenger f7713;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public MediaBrowserService f7714;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f7715 = new ArrayList();

    public C2086(AbstractServiceC21032 abstractServiceC21032) {
        this.f7712 = abstractServiceC21032;
    }

    @Override // l.InterfaceC23960
    public void onCreate() {
        C14788 c14788 = new C14788(this, this.f7712);
        this.f7714 = c14788;
        c14788.onCreate();
    }
}
