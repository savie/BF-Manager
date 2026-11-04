package l;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC6138 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public static volatile C23292 f20954;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f20955 = 0;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public final List f20956 = C21054.m48113();

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public C11999 f20957;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public C15832 f20958;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "PasswordManager";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17739(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            f20954 = null;
        } else {
            f20954 = new C23292(str, str2);
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40418(R.layout.MT_Protector);
        m40418(R.string.MT_Protector);
        C16390 c16390 = (C16390) m40418(R.id.MT_Protector);
        this.f56046 = c16390;
        m40407(c16390);
        m40393();
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC7876(4, this));
        C25227 c25227 = (C25227) m40418(R.id.MT_Protector);
        TextView textView = (TextView) m40418(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        C15832 c15832 = new C15832(this);
        this.f20958 = c15832;
        c15832.registerAdapterDataObserver(new C11357(this, textView));
        textView.setVisibility(this.f20956.isEmpty() ? 0 : 8);
        c25227.setAdapter(this.f20958);
        C11999 c11999 = new C11999(new C24784(this));
        this.f20957 = c11999;
        c11999.m30173(c25227);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd = menu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector);
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setIcon(R.drawable.MT_Protector);
        MenuItem menuItemAdd2 = menu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector);
        menuItemAdd2.setShowAsAction(2);
        menuItemAdd2.setIcon(R.drawable.MT_Protector);
        MenuItem menuItemAdd3 = menu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector);
        menuItemAdd3.setShowAsAction(2);
        menuItemAdd3.setIcon(R.drawable.MT_Protector);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.MT_Protector) {
            m17742(-1);
            return true;
        }
        if (menuItem.getItemId() == R.id.MT_Protector) {
            startActivity(new Intent(this, (Class<?>) ActivityC10589.class));
            return true;
        }
        if (menuItem.getItemId() != R.id.MT_Protector) {
            return false;
        }
        View viewM40395 = m40395(R.layout.MT_Protector);
        C23292 c23292 = f20954;
        if (c23292 != null) {
            TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
            textView.setTextIsSelectable(true);
            textView.setLineSpacing(0.0f, 1.05f);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) c23292.f75455);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C3296.f10758), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) c23292.f75454);
            textView.setText(spannableStringBuilder);
        }
        C2361 c2361BuildDialog = buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8016();
        return true;
    }

    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f20958.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m17742(int i) {
        C14340 c14340 = i == -1 ? new C14340("", "") : (C14340) this.f20956.get(i);
        C16578 c16578 = new C16578(this, this, i, c14340);
        c16578.m25513(i == -1 ? R.string.MT_Protector : R.string.MT_Protector);
        c16578.m25511(R.string.MT_Protector, c14340.f45235);
        c16578.m25511(R.string.MT_Protector, c14340.f45234);
        c16578.m25517();
        C21576.m49069(new RunnableC12350(2, c16578), 200L);
        C1626 c1626M25516 = c16578.m25516(0);
        C1626 c1626M25517 = c16578.m25516(1);
        C23255 c23255M5756 = c1626M25516.m5756();
        C17359.requireNonNull(c23255M5756);
        c23255M5756.m53899(new C17324(c1626M25516, c1626M25517));
        c1626M25517.m5771();
        c1626M25517.m5756().m52337(getString(R.string.MT_Protector));
    }
}
