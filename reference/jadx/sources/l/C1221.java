package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.services.s3.model.ListObjectsRequest;

/* JADX INFO: renamed from: l.֨ܰ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: V89B */
/* JADX INFO: loaded from: classes3.dex */
public final class C1221 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9423 f4463;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f4464;

    public C1221(AbstractActivityC17204 abstractActivityC17204, C9423 c9423) {
        this.f4464 = abstractActivityC17204;
        this.f4463 = c9423;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f4464, R.string.MT_Protector);
        C13511 c13511 = this.f7780;
        C17359.requireNonNull(c13511);
        c13511.m33188(new RunnableC22836(5, c13511));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C9423 c9423 = this.f4463;
        StaticCredentialsProvider staticCredentialsProvider = new StaticCredentialsProvider(new BasicAWSCredentials(c9423.f30575, c9423.f30578));
        ClientConfiguration clientConfiguration = new ClientConfiguration();
        String strM24795 = C9423.m24795(c9423.f30581, clientConfiguration);
        C10915 c10915 = new C10915(staticCredentialsProvider, clientConfiguration);
        c10915.mo151(strM24795);
        c10915.m27690(c9423.f30579);
        c10915.m442(new ListObjectsRequest(c9423.f30580, "", "", "", 10));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f7780.m33196()) {
            return;
        }
        C22673.m51152(R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f7780.m33196()) {
            return;
        }
        this.f4464.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        if (this.f7780.m33196()) {
            return;
        }
        m8196();
    }
}
