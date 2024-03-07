package net.crypticverse.desktop;

import java.io.IOException;
import java.util.Objects;

class KDEImpl implements BrowseUrlHandler {
    public static boolean isSupported() {
        return XDGImpl.isSupported() && Objects.equals(System.getenv("XDG_CURRENT_DESKTOP"), "KDE");
    }

    @Override
    public void browseTo(String url) throws IOException {
        Runtime.getRuntime()
                .exec(new String[] { "kde-open", url });
    }
}
