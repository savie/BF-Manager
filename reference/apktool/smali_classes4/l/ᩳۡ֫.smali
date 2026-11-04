.class public final synthetic Ll/ᩳۡ֫;
.super Ljava/lang/Object;
.source "E72G"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic ۙ:Ll/ۘۖ֫;

.field public final synthetic ۤ:Ljava/lang/String;

.field public final synthetic ᩷:Landroid/os/Bundle;

.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(Ll/ۘۖ֫;Landroid/os/Bundle;Ljava/lang/String;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۡ֫;->ۙ:Ll/ۘۖ֫;

    iput-object p2, p0, Ll/ᩳۡ֫;->᩷:Landroid/os/Bundle;

    iput-object p3, p0, Ll/ᩳۡ֫;->ۤ:Ljava/lang/String;

    iput p4, p0, Ll/ᩳۡ֫;->᩸:I

    return-void
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 4

    .line 0
    iget v0, p0, Ll/ᩳۡ֫;->᩸:I

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Ll/ᩳۡ֫;->ۙ:Ll/ۘۖ֫;

    iget-object v2, p0, Ll/ᩳۡ֫;->᩷:Landroid/os/Bundle;

    iget-object v3, p0, Ll/ᩳۡ֫;->ۤ:Ljava/lang/String;

    invoke-static {v1, v2, v3, v0, p1}, Ll/ۘۖ֫;->ۙ(Ll/ۘۖ֫;Landroid/os/Bundle;Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method
