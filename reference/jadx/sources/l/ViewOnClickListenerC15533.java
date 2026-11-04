package l;

import android.app.Application;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܳᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC15533 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50536;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f50537;

    public /* synthetic */ ViewOnClickListenerC15533(int i, Object obj) {
        this.f50536 = i;
        this.f50537 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f50536;
        Object obj = this.f50537;
        switch (i) {
            case 0:
                C17771.m41581((C17771) obj);
                break;
            case 1:
                C23255 c23255 = (C23255) obj;
                String string = ((TextView) view).getText().toString();
                int iM53968 = c23255.m53968();
                int iM53882 = c23255.m53882();
                if (iM53968 > iM53882) {
                    iM53882 = iM53968;
                    iM53968 = iM53882;
                }
                c23255.m54021().replace(iM53968, iM53882, string);
                c23255.mo52339(string.length() + iM53968);
                break;
            case 2:
                int[] iArr = (int[]) obj;
                if (!(iArr[0] == 0 ? ServiceC3107.m10148() : ServiceC22717.m51237())) {
                    if (iArr[0] != 0) {
                        ServiceC22717.m51233();
                    } else {
                        int i2 = ServiceC3107.f10060;
                        Application applicationM49084 = C21576.m49084();
                        C7508.m20562(applicationM49084, new Intent(applicationM49084, (Class<?>) ServiceC3107.class));
                    }
                } else if (iArr[0] != 0) {
                    int i3 = ServiceC22717.f73718;
                    Application applicationM49085 = C21576.m49084();
                    applicationM49085.stopService(new Intent(applicationM49085, (Class<?>) ServiceC22717.class));
                } else {
                    int i4 = ServiceC3107.f10060;
                    Application applicationM49086 = C21576.m49084();
                    applicationM49086.stopService(new Intent(applicationM49086, (Class<?>) ServiceC3107.class));
                }
                break;
            case 3:
                ServiceC10702 serviceC10702 = (ServiceC10702) obj;
                serviceC10702.f33986.m54145(serviceC10702.f33981.m38589(), serviceC10702.f33981.m38587());
                break;
            case 4:
                ((RunnableC4995) obj).run();
                break;
            default:
                int i5 = ActivityC25343.f81819;
                ((ActivityC25343) obj).finish();
                break;
        }
    }
}
