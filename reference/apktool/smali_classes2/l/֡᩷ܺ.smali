.class public final synthetic Ll/֡᩷ܺ;
.super Ljava/lang/Object;
.source "Z6W9"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ܰ:Ll/ܽ֡֫;


# direct methods
.method public synthetic constructor <init>(Ll/ܽ֡֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡᩷ܺ;->ܰ:Ll/ܽ֡֫;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 137
    iget-object p1, p0, Ll/֡᩷ܺ;->ܰ:Ll/ܽ֡֫;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ܽ֡֫;->ۙ(Ljava/lang/String;)V

    return-void
.end method
