package l;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;

/* JADX INFO: renamed from: l.۫ܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC12499 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f41793 = 0;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public static volatile C16027 f41794;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C20965 f41795;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public C4647 f41796;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public final List f41797 = C11088.m27972();

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "PasswordManager";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31046(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            f41794 = null;
        } else {
            f41794 = new C16027(str, str2);
        }
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m31016(R.layout.MT_Protector);
        m31016(R.string.MT_Protector);
        C6938 c6938 = (C6938) m31016(R.id.MT_Protector);
        this.f41645 = c6938;
        m31004(c6938);
        m31017();
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC17445(2, this));
        C17492 c17492 = (C17492) m31016(R.id.MT_Protector);
        TextView textView = (TextView) m31016(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        C20965 c20965 = new C20965(this);
        this.f41795 = c20965;
        c20965.registerAdapterDataObserver(new C19554(this, textView));
        textView.setVisibility(this.f41797.isEmpty() ? 0 : 8);
        c17492.setAdapter(this.f41795);
        C4647 c4647 = new C4647(new C8971(this));
        this.f41796 = c4647;
        c4647.m12825(c17492);
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
            m31044(-1);
            return true;
        }
        if (menuItem.getItemId() == R.id.MT_Protector) {
            startActivity(new Intent(this, (Class<?>) ActivityC3617.class));
            return true;
        }
        if (menuItem.getItemId() != R.id.MT_Protector) {
            return false;
        }
        View viewM30995 = m30995(R.layout.MT_Protector);
        C16027 c16027 = f41794;
        if (c16027 != null) {
            TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
            textView.setTextIsSelectable(true);
            textView.setLineSpacing(0.0f, 1.05f);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) c16027.f51864);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C20368.f66007), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) c16027.f51863);
            textView.setText(spannableStringBuilder);
        }
        C8067 c8067BuildDialog = buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21269();
        return true;
    }

    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f41795.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m31044(int i) {
        C6148 c6148 = i == -1 ? new C6148("", "") : (C6148) this.f41797.get(i);
        C10382 c10382 = new C10382(this, this, i, c6148);
        c10382.m47198(i == -1 ? R.string.MT_Protector : R.string.MT_Protector);
        c10382.m47195(R.string.MT_Protector, c6148.f21002);
        c10382.m47195(R.string.MT_Protector, c6148.f21001);
        c10382.m47192();
        C16737.m39274(new RunnableC3185(4, c10382), 200L);
        TextInputLayout textInputLayoutM47200 = c10382.m47200(0);
        TextInputLayout textInputLayoutM47201 = c10382.m47200(1);
        EditText editText = textInputLayoutM47200.getEditText();
        C13638.requireNonNull(editText);
        editText.addTextChangedListener(new C7559(textInputLayoutM47200, textInputLayoutM47201));
        textInputLayoutM47201.setExpandedHintEnabled(false);
        textInputLayoutM47201.getEditText().setHint(R.string.MT_Protector);
    }
}
