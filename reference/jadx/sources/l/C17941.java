package l;

import android.content.DialogInterface;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes4.dex */
public final class C17941 extends WebChromeClient {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10181 f57395;

    public C17941(ActivityC10181 activityC10181) {
        this.f57395 = activityC10181;
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        String url = webView.getUrl();
        ActivityC10181 activityC10181 = this.f57395;
        if (activityC10181.m25915(url)) {
            activityC10181.setTitle(activityC10181.f34773.f30172);
        } else {
            if (str == null || str.trim().isEmpty()) {
                return;
            }
            activityC10181.setTitle(str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        this.f57395.m25922(i, i < 100);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
        ActivityC10181 activityC10181 = this.f57395;
        String strM25949 = ActivityC10181.m25949(activityC10181, str);
        if (strM25949 == null || activityC10181.isFinishing() || activityC10181.isDestroyed()) {
            jsResult.cancel();
            return true;
        }
        C8067 c8067BuildDialog = activityC10181.buildDialog();
        c8067BuildDialog.m21277(strM25949);
        c8067BuildDialog.m21261(str2);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC20100(1, jsResult));
        c8067BuildDialog.m21256(new DialogInterface.OnCancelListener() { // from class: l.֨ۡۘ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C8064 c8064 = ActivityC10181.f34767;
                jsResult.cancel();
            }
        });
        c8067BuildDialog.m21269();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
        ActivityC10181 activityC10181 = this.f57395;
        String strM25949 = ActivityC10181.m25949(activityC10181, str);
        if (strM25949 == null || activityC10181.isFinishing() || activityC10181.isDestroyed()) {
            jsResult.cancel();
            return true;
        }
        C8067 c8067BuildDialog = activityC10181.buildDialog();
        c8067BuildDialog.m21277(strM25949);
        c8067BuildDialog.m21261(str2);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۨۡۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C8064 c8064 = ActivityC10181.f34767;
                jsResult.confirm();
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۖۡۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C8064 c8064 = ActivityC10181.f34767;
                jsResult.cancel();
            }
        });
        c8067BuildDialog.m21256(new DialogInterface.OnCancelListener() { // from class: l.ۚۡۘ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C8064 c8064 = ActivityC10181.f34767;
                jsResult.cancel();
            }
        });
        c8067BuildDialog.m21269();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
        ActivityC10181 activityC10181 = this.f57395;
        String strM25949 = ActivityC10181.m25949(activityC10181, str);
        if (strM25949 == null || activityC10181.isFinishing() || activityC10181.isDestroyed()) {
            jsPromptResult.cancel();
            return true;
        }
        final EditText editText = new EditText(activityC10181);
        editText.setSingleLine(true);
        if (str3 == null) {
            str3 = "";
        }
        editText.setText(str3);
        editText.selectAll();
        C8067 c8067BuildDialog = activityC10181.buildDialog();
        c8067BuildDialog.m21277(strM25949);
        c8067BuildDialog.m21261(str2);
        c8067BuildDialog.m21258(editText);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۗ᩵ۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C8064 c8064 = ActivityC10181.f34767;
                jsPromptResult.confirm(editText.getText().toString());
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۙۡۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C8064 c8064 = ActivityC10181.f34767;
                jsPromptResult.cancel();
            }
        });
        c8067BuildDialog.m21256(new DialogInterface.OnCancelListener() { // from class: l.ܰۡۘ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C8064 c8064 = ActivityC10181.f34767;
                jsPromptResult.cancel();
            }
        });
        c8067BuildDialog.m21269();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        valueCallback.onReceiveValue(null);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        permissionRequest.deny();
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        callback.invoke(str, false, false);
    }
}
