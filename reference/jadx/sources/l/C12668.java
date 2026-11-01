package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.services.s3.model.ListObjectsRequest;

/* JADX INFO: renamed from: l.۫᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: V89B */
/* JADX INFO: loaded from: classes4.dex */
public final class C12668 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17606 f42302;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f42303;

    public C12668(AbstractActivityC12483 abstractActivityC12483, C17606 c17606) {
        this.f42303 = abstractActivityC12483;
        this.f42302 = c17606;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f42303, R.string.MT_Protector);
        C17485 c17485 = this.f12806;
        C13638.requireNonNull(c17485);
        c17485.m40697(new RunnableC1774(3, c17485));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C17606 c17606 = this.f42302;
        StaticCredentialsProvider staticCredentialsProvider = new StaticCredentialsProvider(new BasicAWSCredentials(c17606.f55949, c17606.f55953));
        ClientConfiguration clientConfiguration = new ClientConfiguration();
        String strM40926 = C17606.m40926(c17606.f55948, clientConfiguration);
        C4906 c4906 = new C4906(staticCredentialsProvider, clientConfiguration);
        c4906.mo157(strM40926);
        c4906.m13638(c17606.f55950);
        c4906.m448(new ListObjectsRequest(c17606.f55952, "", "", "", 10));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f12806.m40693()) {
            return;
        }
        C15829.m37611(R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f12806.m40693()) {
            return;
        }
        this.f42303.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        if (this.f12806.m40693()) {
            return;
        }
        m10251();
    }
}
