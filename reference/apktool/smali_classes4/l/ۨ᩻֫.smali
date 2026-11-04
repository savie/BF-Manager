.class public final Ll/ۨ᩻֫;
.super Ljava/lang/Object;
.source "R6JT"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ܰ:Ll/ۤ۠ܺ;

.field public final ᩶:Ll/ۡۚ֫;


# direct methods
.method public constructor <init>(Ll/ۤ۠ܺ;Ll/ۡۚ֫;)V
    .locals 0

    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 151
    iput-object p1, p0, Ll/ۨ᩻֫;->ܰ:Ll/ۤ۠ܺ;

    .line 152
    iput-object p2, p0, Ll/ۨ᩻֫;->᩶:Ll/ۡۚ֫;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 157
    iget-object v0, p0, Ll/ۨ᩻֫;->ܰ:Ll/ۤ۠ܺ;

    iget-object v0, v0, Ll/ۤ۠ܺ;->ۙ:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 158
    iget-object v0, p0, Ll/ۨ᩻֫;->᩶:Ll/ۡۚ֫;

    invoke-virtual {v0}, Ll/ۡۚ֫;->close()V

    return-void
.end method
