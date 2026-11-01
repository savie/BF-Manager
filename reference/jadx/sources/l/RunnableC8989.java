package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.DirectoryStream;
import java.util.Set;

/* JADX INFO: renamed from: l.ۡܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8989 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC8989(DirectoryStream directoryStream) {
        this.b = directoryStream;
    }

    public /* synthetic */ RunnableC8989(C22394 c22394) {
        this.b = c22394;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                DirectoryStream directoryStream = (DirectoryStream) this.b;
                Set set = C5212.a;
                try {
                    directoryStream.close();
                    return;
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            default:
                ((C22394) this.b).close();
                return;
        }
    }
}
